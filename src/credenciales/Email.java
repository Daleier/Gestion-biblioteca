/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credenciales;

/**
 *
 * @author dam110
 */
public class Email {
    private String email;
    
    public void email(String email){
        if(comprobar(email.trim())){
            this.email = email.trim();
        }
        else {
            throw new EmailIncorrectoException();
        }
    }
    
    public boolean comprobar(String email){
        return false;
    }
}
