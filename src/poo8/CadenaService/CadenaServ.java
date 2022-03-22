/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8.CadenaService;

import java.util.Scanner;
import poo8.CadenaEntidades.Cadena;

/**
 *
 * @author david
 */
public class CadenaServ {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Cadena crearCadena() {
        
        Cadena f = new Cadena();
        
        
        System.out.println("Por favor ingrese una frase");
        f.setFrase(leer.next());
        System.out.println(" ");
        
        f.setLongi(f.getFrase().length());
        
        return f;
    }
    
    //contabilizar cant de vocales en la frase
   public void mostrarVocales(Cadena f) {
       
       int cont=0;
       for (int i = 0; i < f.getLongi() ; i++) {
           
           //con chartAt se puede ir leyendo letra por letra
           if (f.getFrase().charAt(i)== 'a' || f.getFrase().charAt(i)== 'e' || f.getFrase().charAt(i)== 'i' || f.getFrase().charAt(i)== 'o' || f.getFrase().charAt(i)== 'u') {
               
               cont += 1;
               
           }
       }
      
       System.out.println("En su frase hay "+cont+" vocales"); 
       System.out.println(" ");
   } 
    
    public void invertirFrase(Cadena f) {
        
        /**
         * para invertir una frase por caracter, se crea un objeto de tipo StringBuilder
         * para despues en un sout poder ingresar al metodo reverse e invertir la frase
         */
        StringBuilder sb = new StringBuilder(f.getFrase());
        
        System.out.println(sb.reverse());
        System.out.println(" ");
    } 
   
    
    public void vecesRepetido(Cadena f) {
        
        System.out.println("ingrese letra a buscar");
        String letra = leer.next();
        
        int cont=0;
       for (int i = 0; i < f.getLongi() ; i++) {
           
           //en la variable letra se pone tbm charAt sino larga error de que frase es char y letra es string
           //y puse posición cero ya que es una sola letra
           if (f.getFrase().charAt(i)== letra.charAt(0) ) {
               
               cont += 1;
               
           }
       } System.out.println(" ");
       
       
       //este if es para que en caso de que no se encuentre la letra lo diga por pantalla
       if (cont !=0) {
           
            System.out.println("El caracte ingresado se repite "+cont+" veces");
            
       } else {
           
           System.out.println("El caracte no se encuentra");
           
       } System.out.println(" ");
    } 
    
   
    public void compararLongitud(Cadena f) {
        
        System.out.println("Ingrese una nueva frase");
        String frase2 = leer.next();
        
        int longi2 = frase2.length();
        
        System.out.println("la longitud de la primer frase es "+f.getLongi()+" caracteres y la longitud de tu nueva frase es de "+longi2+" caracteres");
        System.out.println(" ");
        
        
    } 
    
    public void unirFrase(Cadena f) {
        
        System.out.println("Ingrese otra frase");
        String f2 = leer.next();
        
        System.out.println("La unión de esta frase con la original es: "+f.getFrase()+" "+f2);
        
    }
    
    public void reemplazar(Cadena f) {
        
        System.out.println("Elija un caracter nuevo para reemplazar todas las letras 'a' de la frase original");
        String carac = leer.next();
        
        /** con el ".replace" puedo reemplazar todas las A con el caracter ingresado por el usuario
         * ademas creé una variable cadena para guardar la nueva frase sino no me deja mostrarla con los 
         * cambios
         */
       String subcadena = f.getFrase().replace("a", carac);
        
        System.out.println(subcadena);
        
    }
    boolean verd;
    public void contiene(Cadena f) {
        
        System.out.println("ingrese letra a buscar");
        String letra = leer.next();
        
        
        
        for (int i = 0; i < f.getLongi(); i++) {
            
            if (f.getFrase().charAt(i) == letra.charAt(0)) {
                
                verd=true;
                
            } else {
                
                verd= false;
            }
        }
        
            if (verd ==true) {
                
                System.out.println("VERDADERO");
            } else {
                System.out.println("FALSO");
            }
            
       
        
    }
    
}
