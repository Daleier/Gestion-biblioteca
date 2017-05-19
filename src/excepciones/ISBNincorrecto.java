/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author dam110
 */
public class ISBNincorrecto extends Exception {

    @Override
    public String getMessage() {
        return "El ISBN debe tener 10 o 13 digitos.";
    }
    
    
}
