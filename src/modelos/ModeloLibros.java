/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.DefaultListModel;
import libros.ListaLibros;

/**
 *
 * @author dam110
 */
public class ModeloLibros extends DefaultListModel {
    ListaLibros lista;
   
   public void cargar(ListaLibros l){
       lista = l;
       this.fireContentsChanged(this, 0, size());
   }
   @Override
   public int getSize(){
       return lista.tam();
   }
   
   @Override
   public Object getElementAt(int index){
       return lista.getLibro(index).isbn.getIsbn();
   }
   
}
