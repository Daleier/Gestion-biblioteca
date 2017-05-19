/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credenciales;
import excepciones.ISBNincorrecto;
/**
 * crea un isbn correcto (10 o 13 digitos)
 * @author dam110
 */
public class ISBN {
    private final String isbn;
    
    public ISBN(String isbn) throws ISBNincorrecto{
        if(comprobarISBN(isbn.trim())){
            this.isbn = isbn;
        }else{
            throw new ISBNincorrecto();
        }
    }

    /**
     * comprueba si el isbn es valido
     * @param isbn
     * @return 
     */
    private boolean comprobarISBN(String isbn) {
        if(isbn.length()!=10 && isbn.length()!=13){ //comprueba longitud = 10 o 13
            return false;
        }else{
            for(int a = 0; a< isbn.length();a++){ //comprueba, si todos los caracteres son digitos
                if(!Character.isDigit(isbn.charAt(a))){
                    return false;
                }
            } 
        }
        return true;
    }

    public String getIsbn() {
        return isbn;
    }
    
}
