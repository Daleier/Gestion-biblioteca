/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import excepciones.DNIincorrectoException;
import excepciones.EmailIncorrectoException;
import excepciones.NombreIncorrectoException;
import excepciones.PassIncorrectaException;
import excepciones.UsuarioYaExisteException;

/**
 *
 * @author dam110
 */
public class Bibliotecario extends Usuario{
    byte maxPrestamos = 10;
    
    public Bibliotecario(String name, String dni, String email, String pass) throws NombreIncorrectoException, DNIincorrectoException, PassIncorrectaException, EmailIncorrectoException, UsuarioYaExisteException{
        super(name, dni, email, pass);
    }
}
