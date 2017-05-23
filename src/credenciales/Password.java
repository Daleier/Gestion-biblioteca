/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credenciales;
import excepciones.PassIncorrectaException;
/**
 *
 * @author dam110
 */
public class Password {
    private String password;
    
    /**
     * crea contraseña, debe tener una longitud minima de 5 caracteres cualquiera
     * @param pass 
     * @throws excepciones.PassIncorrectaException la contraseña tiene menos de 5 caracteres
     */
    public Password(String pass) throws PassIncorrectaException{
        if(pass.length()<5){
            throw new PassIncorrectaException();
        }else{
            this.password = pass;
        }
    }
    
    public String getPassword() {
        return this.password;
    }
}
