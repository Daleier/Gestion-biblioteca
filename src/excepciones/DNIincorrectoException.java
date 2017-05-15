/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * se lanza cuando el dni es incorrecto
 * @author dam110
 */
public class DNIincorrectoException extends Exception {
    public void DNIincorrectoException(){
        System.out.println("DNI NO VÁLIDO");
    }

    @Override
    public String getMessage() {
        return "El DNI debe tener 8 numeros y 1 letra.";
    }

}
