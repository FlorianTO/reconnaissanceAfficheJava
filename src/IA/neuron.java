package IA;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ftourinel
 */
public class neuron {
    /**
     * File containing the weigths for the current neuron
     */
    FileReader weigthFile;
    
    /**
     * Neuron constructor
     * 
     * @param layer current layer
     * @param neuron current neuron
     */
    public neuron(int layer, int neuron) {
        try {
            this.weigthFile = new FileReader(".txt");
        }catch(FileNotFoundException e){
            System.err.println("error, neuron weigth file not found : " + e);
        }
    }
}
