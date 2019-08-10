/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Modelo;
import View.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nathaly Salazar
 * @version 1.0
 */
public class Controlador implements ActionListener{
    /**
     * Instancia de las clases 
     */
    private Vista vista;
    private Modelo modelo;

    /**
     * Constructor de la clase 
     * @param vista
     * @param modelo 
     */
    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.bt_agregar.addActionListener(this);
        
    }
    /**
     * Inicia la conexion entre la vista y la ubicacion de la vista
     */
    public void iniciar(){
        vista.setTitle("Bienvenido");
        vista.setLocationRelativeTo(null);
    }
    /**
     * Recibe los valores de la caja de texto y los envia para agregar a la lista 
     * para luego mostrar la lista.
     * @param e 
     */
    public void actionPerformed(ActionEvent e) {
        Modelo model = new Modelo();
        model.setTexto(vista.tb_texto.getText());
        model.agregarLista();
        vista.tb_lista.setText(String.valueOf(model.getLista()));
        
    }

    
    
    
}
