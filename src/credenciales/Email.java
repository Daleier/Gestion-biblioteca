/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credenciales;
import excepciones.EmailIncorrectoException;

/**
 *objeto email String de formato A@X.N, siendo N como minimo 2 caracteres, y N 2 o 3.
 * la longitud maxima no puede ser mayor de 20
 * @author dam110
 */
public final class Email {
    private final String email;
    
    public Email(String email) throws EmailIncorrectoException{
        if(comprobar(email.trim())){
            this.email = email.trim();
        }else{
            throw new EmailIncorrectoException();
        }
    }
    
    public boolean comprobar(String email){
        if(email.length()>20 || email.isEmpty()){//comprueba si el mail tiene entre 1 y 20 caracteres
            return false;
        }
        if(comprobarArr(email)==true && comprobarPunto(email) == true){
            return true;
        }else{
            return false;
        }

    }
    
    /**
     * comprueba si el email introducido tiene una @ entre el 2do caracter y el longitud - 5
     * @param email1
     * @return 
     */
    private boolean comprobarArr(String email) {
        boolean tienearoba = false;
        for (int a = 1; a < email.length(); a++) {
            if (email.charAt(a) == '@') {
                tienearoba = true;
                break;
            }
        }
        return tienearoba;
    }
    
    /**
     * comprueba si el email tiene punto
     * @param email
     * @return 
     */
    private boolean comprobarPunto(String email){
        boolean punto = false;
        for (int a = 1; a < email.length(); a++) {
            if (email.charAt(a) == '.') {
                punto = true;
                break;
            }
        }
        return punto;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {         
        Email mail = (Email) o;
        return this.email.equals(mail.getEmail());
    }
    
    
}
