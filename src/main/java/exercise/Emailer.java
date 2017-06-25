/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Staal
 */
public class Emailer {
    
    private final String mailTo = "admin@starwars.com";
    
     /**
     * This sends an email to the receiver given in: mailTo. IMPORTANT if you
     * see the output below, you should interpret is as that a REAL EMAIL was
     * sent
     *
     * @param text Text to include in the mail
     */
    public void Emailer(String text) {
        System.out.println("#####################################################################################");
        System.out.println("This simulates that a REAL EMAIL was sent to: " + mailTo + " with this text:\n" + text);
        System.out.println("#####################################################################################");
    }
}
