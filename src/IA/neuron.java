package IA;

import java.io.*;

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
    String weigthFile;

    int nbWeights;
    /**
     * Neuron constructor
     * 
     * @param layer current layer
     * @param neuron current neuron
     * @param nameFile the name of the file containing the weigths for the current neuron
     */
    public neuron(int layer, int neuron, String nameFile) {
        try {
            String line;
            BufferedReader r = new BufferedReader(new FileReader(nameFile + ".txt"));
            BufferedWriter w = new BufferedWriter(new FileWriter(weightFile + ".txt"));
            this.nbWeights = 0;
            while((line = file.readLine()) != null){
                w.write(line, 0, line.length);
                w.newLine();
                this.nbWeights++;
            }
            w.close();
            r.close();
        }catch(FileNotFoundException e){
            System.err.println("error, neuron weigth file not found : " + e);
        }
    }
}
