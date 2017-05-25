/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import credenciales.ISBN;
import excepciones.ISBNincorrecto;
import excepciones.ISBNyaExisteException;
import java.util.Date;
/**
 *
 * @author dam110
 */
public class Libro{
    private String titulo;
    private String autor;
    private String editorial;
    public ISBN isbn;
    public Date fechaPrestamo;
    public Date fechaLimite;
    static ListaLibros lista = new ListaLibros();
    
    public Libro(String titulo, String autor, String editorial, String isbn) throws ISBNincorrecto, ISBNyaExisteException{
        this.titulo = titulo.trim();
        this.autor = autor.trim();
        this.editorial = editorial.trim();
        this.isbn = new ISBN(isbn);
        lista.addLibro(this);
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
}
