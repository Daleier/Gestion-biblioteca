/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import credenciales.ISBN;

/**
 *
 * @author dam110
 */
public interface Prestamos {
    
    public void sacarLibro(ISBN isbn);
    public void deolverLibro(ISBN isbn);
}
