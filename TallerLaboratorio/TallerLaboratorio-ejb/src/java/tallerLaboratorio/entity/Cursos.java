/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerLaboratorio.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tatan
 */
@Entity
@Table(name = "CURSOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cursos.findAll", query = "SELECT c FROM Cursos c"),
    @NamedQuery(name = "Cursos.findByIdcodigo", query = "SELECT c FROM Cursos c WHERE c.idcodigo = :idcodigo"),
    @NamedQuery(name = "Cursos.findByNombre", query = "SELECT c FROM Cursos c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Cursos.findByNumcreditos", query = "SELECT c FROM Cursos c WHERE c.numcreditos = :numcreditos"),
    @NamedQuery(name = "Cursos.findBySemestre", query = "SELECT c FROM Cursos c WHERE c.semestre = :semestre"),
    @NamedQuery(name = "Cursos.findByNumestudiante", query = "SELECT c FROM Cursos c WHERE c.numestudiante = :numestudiante")})
public class Cursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCODIGO")
    private Integer idcodigo;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NUMCREDITOS")
    private Integer numcreditos;
    @Column(name = "SEMESTRE")
    private Integer semestre;
    @Column(name = "NUMESTUDIANTE")
    private Integer numestudiante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cursos")
    private Collection<Studentcurso> studentcursoCollection;

    public Cursos() {
    }

    public Cursos(Integer idcodigo) {
        this.idcodigo = idcodigo;
    }

    public Integer getIdcodigo() {
        return idcodigo;
    }

    public void setIdcodigo(Integer idcodigo) {
        this.idcodigo = idcodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumcreditos() {
        return numcreditos;
    }

    public void setNumcreditos(Integer numcreditos) {
        this.numcreditos = numcreditos;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getNumestudiante() {
        return numestudiante;
    }

    public void setNumestudiante(Integer numestudiante) {
        this.numestudiante = numestudiante;
    }

    @XmlTransient
    public Collection<Studentcurso> getStudentcursoCollection() {
        return studentcursoCollection;
    }

    public void setStudentcursoCollection(Collection<Studentcurso> studentcursoCollection) {
        this.studentcursoCollection = studentcursoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcodigo != null ? idcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.idcodigo == null && other.idcodigo != null) || (this.idcodigo != null && !this.idcodigo.equals(other.idcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tallerLaboratorio.entity.Cursos[ idcodigo=" + idcodigo + " ]";
    }
    
}
