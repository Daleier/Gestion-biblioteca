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
public class NombreIncorrectoException extends Exception {
    @Override
    public String getMessage() {
        return "Nombre debe tener menos de 15 caracteres.";
    }
}