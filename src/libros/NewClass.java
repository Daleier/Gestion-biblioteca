/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;
import excepciones.*;
import java.lang.*;
/**
 *
 * @author dam110
 */
public class NewClass {
    public static void main(String[] args) throws ISBNincorrecto {
        Libro a = new Libro("titulo","autor","editorial","0123456789");
        a.sacarLibro(a.isbn);
    }
    
}
