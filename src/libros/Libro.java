/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import credenciales.ISBN;
import excepciones.ISBNincorrecto;
import java.util.Date;
import usuarios.Usuario;
/**
 *
 * @author dam110
 */
public class Libro implements Prestamos{
    private String titulo;
    private String autor;
    private String editorial;
    public ISBN isbn;
    static ListaLibros lista = new ListaLibros();
    public Usuario usuario=null;
    
    public Libro(String titulo, String autor, String editorial, String isbn) throws ISBNincorrecto{
        this.titulo = titulo.trim();
        this.autor = autor.trim();
        this.editorial = editorial.trim();
        this.isbn = new ISBN(isbn);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * compara dos libros por isbn
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final Libro other = (Libro) o;
        return this.isbn.getIsbn().equals(other.isbn.getIsbn());
    }

    @Override
    public String toString() {
        String msj = "Alquilado por: "+usuario.getName();
        if(usuario==null){
            msj = "";
        }
        return this.getTitulo()+" - "+msj;
    }
    
    public String quienAlquila(){
        if(usuario==null){
            return "Libre para alquilar.";
        }else{
            return "Alquilado por: "+usuario.getName();
        }
    }

    @Override
    public void sacarLibro(Usuario usu) {
        if(this.usuario == null){
            this.usuario = usu;
        }
    }
    
    @Override
    public void devolverLibro(){
        if(this.usuario != null){
            this.usuario = null;
        }
    };


}
    
    

