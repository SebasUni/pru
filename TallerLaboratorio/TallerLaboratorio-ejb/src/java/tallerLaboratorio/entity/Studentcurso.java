/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerLaboratorio.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tatan
 */
@Entity
@Table(name = "STUDENTCURSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Studentcurso.findAll", query = "SELECT s FROM Studentcurso s"),
    @NamedQuery(name = "Studentcurso.findByCursoid", query = "SELECT s FROM Studentcurso s WHERE s.studentcursoPK.cursoid = :cursoid"),
    @NamedQuery(name = "Studentcurso.findByStudentid", query = "SELECT s FROM Studentcurso s WHERE s.studentcursoPK.studentid = :studentid"),
    @NamedQuery(name = "Studentcurso.findByCantidad", query = "SELECT s FROM Studentcurso s WHERE s.cantidad = :cantidad")})
public class Studentcurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentcursoPK studentcursoPK;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @JoinColumn(name = "CURSOID", referencedColumnName = "IDCODIGO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cursos cursos;
    @JoinColumn(name = "STUDENTID", referencedColumnName = "STUDENTID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;

    public Studentcurso() {
    }

    public Studentcurso(StudentcursoPK studentcursoPK, int cantidad ){
        this.studentcursoPK = studentcursoPK;
        this.cantidad=cantidad;
    }

    public Studentcurso(int cursoid, int studentid) {
        this.studentcursoPK = new StudentcursoPK(cursoid, studentid);
    }

    public StudentcursoPK getStudentcursoPK() {
        return studentcursoPK;
    }

    public void setStudentcursoPK(StudentcursoPK studentcursoPK) {
        this.studentcursoPK = studentcursoPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentcursoPK != null ? studentcursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentcurso)) {
            return false;
        }
        Studentcurso other = (Studentcurso) object;
        if ((this.studentcursoPK == null && other.studentcursoPK != null) || (this.studentcursoPK != null && !this.studentcursoPK.equals(other.studentcursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tallerLaboratorio.entity.Studentcurso[ studentcursoPK=" + studentcursoPK + " ]";
    }
    
}
