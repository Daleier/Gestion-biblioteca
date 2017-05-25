/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.DefaultListModel;
import usuarios.ListaUsuarios;

/**
 *
 * @author dam110
 */
public class ModeloUsuarios extends DefaultListModel{
   ListaUsuarios lista;
   
   public void cargar(ListaUsuarios l){
       lista = l;
       this.fireContentsChanged(this, 0, size());
   }
   @Override
   public int getSize(){
       return lista.tam();
   }
   
   @Override
   public Object getElementAt(int index){
       String cadena = lista.getUsuario(index).getName()+" - "+lista.getUsuario(index).dni.getDni();
       return lista.getUsuario(index).getName();
   }
}
