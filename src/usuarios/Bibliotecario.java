/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import credenciales.DNI;
import credenciales.Email;
import credenciales.Password;
import excepciones.NombreIncorrectoException;

/**
 *
 * @author dam110
 */
public class Bibliotecario extends Usuario{
    byte maxPrestamos = 10;
    
    public void Bibliotecario(String name, DNI dni, Email email, Password pass) throws NombreIncorrectoException{
        super.Usuario(name, dni, email, pass);
    }
}
