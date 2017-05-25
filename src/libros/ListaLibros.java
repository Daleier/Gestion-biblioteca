/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import credenciales.ISBN;
import java.io.Serializable;
import java.util.HashMap;
import excepciones.ISBNyaExisteException;
/**
 *
 * @author dam110
 */
public class ListaLibros implements Serializable{

    private static HashMap<ISBN, Libro> lista = new HashMap<ISBN, Libro>();
   
    public ListaLibros(){}
    
    protected void addLibro(Libro libro) throws ISBNyaExisteException{
        if(!lista.containsKey(libro.isbn)){
            lista.put(libro.isbn, libro);
        }else{
            throw new ISBNyaExisteException();
        }
    }
    
    public int tam(){
       return lista.size();
    }    
    
}

