/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomvc;

import Controller.Controlador;
import Model.Modelo;
import View.Vista;

/**
 *
 * @author Nathaly Salazar
 * @version 1.0
 */
public class EjercicioMvc {

    /**
     * Se inicia el formulario e instancia las clases
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mode = new Modelo();
        Vista vis = new Vista();
        Controlador control = new Controlador(vis,mode);
        control.iniciar();
        vis.setVisible(true);
    }
    
}
