/*
 * Intro to Java Assignment 1
 * Brett Gagnon
 * 9/14/2018
 * Source Code
 */
package assignment2;

import java.util.Scanner;


public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    // Create a scanner to read from keyboard
    Scanner sc = new Scanner (System.in);
        
    //Prompt User
    System.out.println("Enter a line of text to be URL encoded:");
    
    //Assign variable line1 with the string entered from user
    String line1 = sc.nextLine();  
    
    //initialize string line 2 for encoded string
    String line2 = "";
    
    //Print the contents of variable line1
    System.out.println("The String you entered is: " + line1);
    
    //Apply string class method 'length' to string line1 
    System.out.println("The Length of the string in chars is:" + line1.length());
    
    //Assign variable Ascii to contain all ASCII characters
    String ascii = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ012345"
            + "6789_-.*";
    

    //Begin for loop to go through each individual character in string line1
    for (int n=0; n < line1.length(); ++n)
    {
    
   //initialize a char to get single characters from the input string
    char c = line1.charAt(n);
   
    //initialize a string to store hex values of any given character
    String hex = Integer.toHexString(c);
    
    //Final encoded string
    String encoded = "";
    
    // set variable to check if the character needs to be changed (ascii or not)
    int index;
    index = ascii.indexOf(line1.charAt(n));
    //System.out.println("index # is :" + index);
    
    //if the character is a blank
    if (line1.charAt(n) == ' ')
    {
       //concatenate a plus symbol
       encoded += "+"; 
    }  
    
    // if the character needs to be changed (index value = -1)
    else if (index != -1)
       {
        //concatenate the character
        encoded += line1.charAt(n);
       }
         else
            { 
             //concatenate the hex value after an ampersand
              encoded += '%' + hex;
            }
             
    //add the encoded character to the string line2 at the end of every loop
    line2 = line2 + encoded;
       
    } 
     // Print out the encoded string which is stored in line2
    System.out.println("The encoded string is: " + line2);
    
     //Apply string class method 'length' to string line1 
    System.out.println("The Length of the string in chars is:" + line2.length());
   
   
    }
    
}
