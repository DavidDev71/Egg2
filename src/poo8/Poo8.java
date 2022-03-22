/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

import poo8.CadenaEntidades.Cadena;
import poo8.CadenaService.CadenaServ;

/**
 *
 * @author david
 */
public class Poo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancio un objeto de tipo servicio para importarla a esta clase
        CadenaServ cs = new CadenaServ();
        
        // instancio el objeto f para poder iniciar los metodos crearcadena, mostrarvocales, etc.
        Cadena f = cs.crearCadena(); cs.mostrarVocales(f); cs.invertirFrase(f); 
        cs.vecesRepetido(f); cs.compararLongitud(f);cs.unirFrase(f); cs.reemplazar(f);
        cs.contiene(f);
        
        
        
    }
    
}
