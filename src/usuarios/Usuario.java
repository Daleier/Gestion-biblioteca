/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;
import credenciales.*;
import excepciones.NombreIncorrectoException;
/**
 *
 * @author dam110
 */
public class Usuario {
    String name;
    DNI dni;
    Email email;
    Password pass;
    byte maxPrestamos = 3;
    byte prestamosActuales = 0;
    
    public void Usuario(String name, DNI dni, Email email, Password pass) throws NombreIncorrectoException{
        if(name.isEmpty()||name.trim().length()>15){
            throw new NombreIncorrectoException();
        }else{
            this.name = name;
        }
        this.dni = dni;
        this.email = email;
        this.pass = pass;
    }
}
