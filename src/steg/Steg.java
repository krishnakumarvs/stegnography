/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package steg;

import General.Configuration;
import View.Login;

/**
 *
 * @author Jithinpv
 */
public class Steg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Configuration.initializeEnvironment();
        Login login = new Login();
        login.setVisible(true);
        
    }
    
}
