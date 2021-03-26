/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author Tatan
 */
@Local
public interface calcbeanLocal {
    Double resta(double a, double b);

    Double suma(double a, double b);

    Double multiplicacion(double a, double b);

    Double division(double a, double b);

    Double modulo(double a, double b);
    
}
