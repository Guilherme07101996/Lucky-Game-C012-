/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.threads.c012;

import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Seja bem vindo professor! Espero que goste de games de sorte :) , forte abraço!", "Aviso", JOptionPane.WARNING_MESSAGE);
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }
    
}
