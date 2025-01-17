/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menculini_gioco_sedie;

import java.util.logging.Logger;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Menculini Tommaso
 */
public class Menculini_Gioco_Sedie { 
    private final static int NUMSEDIE = 15;
    private static Logger logger = Logger.getLogger("GiocoSedie.TestGiocoSedie");
    String nomeFile;
    
    /**
     * @param args the command line arguments
     * 
     */
public static void main(String[] args) {
    final int NUMSEDIE = 15;
    Scrittore scrittore = new Scrittore("Risultato.txt");

    Posto sedie[] = new Posto[NUMSEDIE];
    for (int k = 0; k < sedie.length; k++)
        sedie[k] = new Posto();

    Display display = new Display(sedie);
    Logger.getLogger("GiocoSedie.TestGiocoSedie").info("Sto facendo partire il Display.\n");
    display.start();

    Partecipante array[] = new Partecipante[NUMSEDIE + 1];
    for (int i = 0; i < NUMSEDIE + 1; i++) {
        array[i] = new Partecipante(sedie, scrittore, i + 1);
        Logger.getLogger("GiocoSedie.TestGiocoSedie")
              .info("Sto facendo partire il thread id: " + array[i].getId() + " name: " + array[i].getName() + "\n");
        array[i].start();
    }
    System.out.println("Il Thread sta scrivendo il File.");
  }
}
        
