/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credenciales;
import excepciones.DNIincorrectoException;

/**
 *clase para dni usuarios
 * @author dam110
 */
public final class DNI{
    private final String DNI;
    

    /**
     * crea un dni de formato 12345678A
     * @param dni
     * @throws DNIincorrectoException el dni no esta dentro del formato especificado
     */
    public DNI(String dni) throws DNIincorrectoException{
        if(this.comprobar(dni.trim())){
            this.DNI = dni.trim();
        }else{
            throw new DNIincorrectoException();
        }
    }

    /**
     * comprueba longitud y letra del dni
     * @param dni
     * @return 
     */
    public boolean comprobar(String dni) {
        if(dni.length()!=9){
           return false;
        }else if(!Character.isLetter(dni.charAt(8))){
            return false;
        }else{
            return comprobarNumeros(dni);
        }
        
    }

    
    /**
     * comprueba que los caracteres del 1 al 8 del dni sean numericos
     * @param dni
     * @return 
     */
    private boolean comprobarNumeros(String dni) {
        for(int a = 0; dni.length()-1<a ; a++){
            if(!Character.isDigit(dni.charAt(a))){
                return false;
            }
        }
        return true;
    }
    
    
    public String getDni() {
        return this.DNI;
    }

    
}
