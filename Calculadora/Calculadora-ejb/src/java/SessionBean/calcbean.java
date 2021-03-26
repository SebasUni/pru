/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author Tatan
 */
@Stateless
public class calcbean implements calcbeanLocal {
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Double resta(double a, double b) { 
        return (a-b);
    }

    @Override
    public Double suma(double a, double b) {
        return (a+b);
    }

    @Override
    public Double multiplicacion(double a, double b) {
        return (a*b);
    }

    @Override
    public Double division(double a, double b) {
        return (a/b);
    }

    @Override
    public Double modulo(double a, double b) {
        return (a%b);
    }
}
