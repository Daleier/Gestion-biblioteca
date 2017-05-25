/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;
import credenciales.*;
import excepciones.DNIincorrectoException;
import excepciones.EmailIncorrectoException;
import excepciones.NombreIncorrectoException;
import excepciones.PassIncorrectaException;
import excepciones.UsuarioYaExisteException;
import libros.Libro;
/**
 *
 * @author dam110
 */
public class Usuario implements Comparable {
    private String name;
    public DNI dni;
    public Email email;
    public Password pass;
    private final byte maxPrestamos = 3;
    private final byte prestamosActuales = 0;
    
    static ListaUsuarios lista = new ListaUsuarios();
 
    public Usuario(String name, String dni, String email, String pass) throws NombreIncorrectoException, DNIincorrectoException, PassIncorrectaException, EmailIncorrectoException, UsuarioYaExisteException{
        if(name.isEmpty()||name.trim().length()>15){
            throw new NombreIncorrectoException();
        }else{
            this.name = name;
        }
        this.dni = new DNI(dni);
        this.email =new Email(email);
        this.pass = new Password (pass);
    }
    
    public String getName(){
        return name;
    }
    
    public byte getMaxPrestamos() {
        return maxPrestamos;
    }

    public byte getPrestamosActuales() {
        return prestamosActuales;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return this.dni.getDni().equals(other.dni.getDni());
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.getName()+"\nDNI: "+this.dni.getDni()+"\nEmail: "+this.email.getEmail();
    }
    
    /**
     * compara los dni de los objetos usuario
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Object o) {
        final int ANTES = -1;
        final int IGUAL = 0;
        final int DESPUES = 1;
        Usuario usuario = (Usuario) o;
        if(this.dni.getDni().compareToIgnoreCase(usuario.dni.getDni()) == 0){
                return IGUAL;
        }else if(this.dni.getDni().compareToIgnoreCase(usuario.dni.getDni()) == 1){
                return DESPUES;
        }else{
                return ANTES;
        }
    }
    
}
