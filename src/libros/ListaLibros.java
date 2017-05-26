/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import credenciales.ISBN;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author dam110
 */
public class ListaLibros implements Serializable{

    private static ArrayList<Libro>lista = new ArrayList<Libro>();
   
    public ListaLibros(){}
    
    public void addLibro(Libro libro){
        lista.add(libro); //añadir comprobación en clase Libro
    }
    
    public void eliminarLibro(Libro libro){
        lista.remove(libro);
    }
    
    public int tam(){
        return lista.size();
    }
    
    public Libro getLibro(int l){
        return (Libro)lista.get(l);
    }
            
}

