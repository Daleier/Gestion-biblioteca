/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import excepciones.UsuarioYaExisteException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;

/**
 *  arraylist que contiene a todos los usuarios
 * @author dam110
 */
public class ListaUsuarios implements Serializable{
    
    private final ArrayList<Usuario> lista;
    
    public ListaUsuarios(){
        lista = new ArrayList<Usuario>();
        this.leerDatosUsuarios();
    }
    
    /**
     * añade a un usuario a la lista tras comprobar si no esta repetido
     * @param user 
     */
    protected void addUser(Usuario user) throws UsuarioYaExisteException{
        if(!comprobarUsuario(user)){
            lista.add(user); //usuario no existe aun en la lista
            System.out.println("Usuario añadido a la lista");
        }else{ //usuario ya existe
            throw new UsuarioYaExisteException();//lanzar excepcion
        }
        this.escribirDatosUsuarios();
    }
    
    /**
     * comprueba si un usuario ya existe en la lista
     * @param user
     * @return true si existe, false si no existe
     */
    private boolean comprobarUsuario(Usuario user){
        ListIterator<Usuario> it = lista.listIterator();
        while(it.hasNext()){
            it.next();
            if(it.equals(user)){
                System.out.println("Usuario exite");
                return true;
            }
        }
        System.out.println("Usuario no existe");
        return false;
    }
    
    /**
     * elimina a un usuario de la lista
     * @param user 
     */
    private void deleteUser(Usuario user){
        ListIterator<Usuario> it = lista.listIterator();
        while(it.hasNext()){
            it.next();
            if(it.equals(user)){
                it.remove();
            }else{
                System.out.println("Usuario a elimnar no existe.");
            }
            this.escribirDatosUsuarios();
        }
    }
    
    /**
     * ordena lista por dni
     */
    private void ordenarLista(){
        Collections.sort(lista);
    }

    /**
     * escribe objetos de lista en usuarios.dat
     */
    public void escribirDatosUsuarios(){
        try{
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("usuarios.dat"));
            ListIterator<Usuario> it = lista.listIterator();
            while(it.hasNext()){
                Usuario usu = it.next();
                salida.writeObject(usu);
            }
            salida.close();
        }catch(FileNotFoundException ex){
            System.out.println("Fichero no encontrado.");
        }catch (IOException ex) {
            System.out.println("Error entrada/salida de datos");
        }
    }
    
    /**
     * añade objetos de usuarios.dat a lista
     */
    public void leerDatosUsuarios(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("usuarios.dat"));
            Usuario usu = (Usuario) entrada.readObject();
            while (usu!=null){
                this.addUser(usu);
                usu = (Usuario) entrada.readObject();
            }
            entrada.close();
        }catch(EOFException ex){
            System.out.println("Fin del fichero");
        }catch(ClassNotFoundException ex){
            System.out.println("No se encuentra el fichero");
        }catch(IOException ex){
            System.out.println("Error en entrada/salida de datos");
        }catch(UsuarioYaExisteException ex){
            System.out.println("Uno de los usuarios del fichero ya existe.");
        }
    }
    
    public boolean iniciarSesion(String name,String pass){
        ListIterator<Usuario> it = lista.listIterator();
        while (it.hasNext()){
            it.next();
            Usuario usu = (Usuario) it;
            if(usu.getName().equalsIgnoreCase(name) && usu.pass.getPassword().equalsIgnoreCase(pass)){
                return true;
            }
        }
        return false;
    }
   
}
