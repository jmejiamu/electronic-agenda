/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import GUI.MainWindow;

/**
 *
 * @author joch_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creation of the main window object
        MainWindow window = new MainWindow();
        
        //Display window 
        window.setVisible(true);
        
        //Center window
        window.setLocationRelativeTo(null);
    }
    
}
