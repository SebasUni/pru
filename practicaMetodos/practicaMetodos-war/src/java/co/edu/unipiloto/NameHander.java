/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto;

/**
 *
 * @author Tatan
 */
public class NameHander {
    private String name;
    private int fechanacimiento;
    private int edad;



    public NameHander() {
        name= null;
        edad=0;
        fechanacimiento=0;
    }

    public String getName() {
        return name;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(int fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getEdad() {
         edad = 2020-fechanacimiento;
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
