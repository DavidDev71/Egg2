/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8.CadenaEntidades;

/**
 *
 * @author david
 */
public class Cadena {
    
    private String frase;
    private int longi;

    public Cadena() {
    }

    public Cadena(String frase, int longi) {
        this.frase = frase;
        this.longi = longi;
    }

    

    public String getFrase() {
        return frase;
    }

    public int getLongi() {
        return longi;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }
    
    
    
    
}
