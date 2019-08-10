/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nathaly Salazar
 * @version 1.0
 */

public class Modelo {
    /**
     * Variable que almacenar el texto recibido de la caja de texto
     */
    private String texto;
    /**
     * Variable que guardara cada texto que sea ingresado en la caja de texto
     */
    private static String lista = "";

    /**
     * get de la variable texto
     * @return 
     */
    public String getTexto() {
        return texto;
    }
    /**
     * set de la variable texto
     * @param texto 
     */

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /**
     * get de la variable lista
     * @return 
     */
    public String getLista() {
        return lista;
    }
    /**
     * set de la variable lista
     * @param lista 
     */
    public void setLista(String lista) {
        this.lista = lista;
    }
    /**
     * funcion que agrega la palabra ingresada en la caja de texto a la lista de texto
     * @return lista de las personas o texto ingresado
     */
    public String agregarLista(){
        
        lista += texto+"\n";
        
        return lista;
    }
}
