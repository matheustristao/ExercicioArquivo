package Principal;


import arquivo.Arquivo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import GUI.Menu;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Arquivo arquivo = new Arquivo();
        Menu menu = new Menu();
        
        menu.setVisible(true);
        
    } 
       
    
    
}
