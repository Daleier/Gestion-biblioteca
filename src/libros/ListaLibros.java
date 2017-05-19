/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author dam110
 */
public class ListaLibros implements Serializable{
    private ArrayList<Libro> lista;
    
    public ListaLibros(){
        lista = new ArrayList<Libro>();
    }
    
    protected void addLibro(Libro libro){
        lista.add(libro);
    }
}
