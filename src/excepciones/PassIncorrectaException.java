/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * se lanza cuando la contraseña es incorrecta
 * @author dam110
 */
public class PassIncorrectaException extends Exception {
    
    @Override
    public String getMessage(){
        return "La contraseña debe tener 5 carácteres minimo.";
    }
}
