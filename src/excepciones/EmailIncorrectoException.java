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
        return "Email debe acabar en @X.N.\nX= 2 o mas caracteres.\nN= 2o 3 caracteres.";
    }
}
