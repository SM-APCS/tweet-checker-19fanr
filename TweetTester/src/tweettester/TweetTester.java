/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweettester;

import java.util.Scanner;
import java.lang.Math; 
/**
 * @class  AP CSA
 * @author INSERT YOUR NAME HERE
 */
public class TweetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create scanner
        Scanner scan = new Scanner (System.in);
        //initialize String tweet
        String tweet;
        //scan String tweet
        tweet = scan.nextLine();
        //print out the length of String tweet
        System.out.println(tweet.length());
    }
    
}
