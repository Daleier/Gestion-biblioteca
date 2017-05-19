/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import credenciales.ISBN;
import java.io.Serializable;
import java.util.HashMap;
import java.util.ListIterator;
/**
 *
 * @author dam110
 */
public class ListaLibros implements Serializable{

    HashMap<ISBN, String> lista;
    public ListaLibros(){
        lista = new <Libro>();
    }
    
    protected void addLibro(Libro libro){
        lista.add(libro);
    }
}
