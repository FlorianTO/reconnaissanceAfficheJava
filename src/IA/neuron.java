package IA;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     * Name of the file containing the weigths for the current neuron
     */
    String weightFile;

    /**
     * Number of weigths for this neuron
     */
    int nbWeights;
    
    /**
     * Neuron constructor
     * 
     * @param layer current layer
     * @param neuron current neuron
     * @param fileName the name of the file containing the weigths for the current neuron
     */
    public neuron(int layer, int neuron, String fileName) {
        try {
            BufferedReader r = new BufferedReader(new FileReader(fileName + ".txt"));
            weightFile = fileName;
            this.nbWeights = Integer.valueOf(r.readLine());
            r.close();
        }catch(FileNotFoundException e){
            System.err.println("error, neuron weigth file not found : " + e);
        } catch (IOException ex) {
            System.err.println("error, neuron number non-writen : " + ex);
        }
    }
}
