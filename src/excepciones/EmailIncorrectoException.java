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
public class EmailIncorrectoException extends Exception{

    @Override
    public String getMessage() {
        return "Email debe tener al menos un @ y  un . y no puede estar vacio o sobrepasar los 20 carácteres.";
    }
}
