/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 *
 *
 * @author loidl
 */

package net.htlgrieskirchen.loidlj190087;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.ConditionalFeature;
import jdk.nashorn.internal.parser.TokenType;

public class NumberTester {
    
    private String fileName;                                                    //FileName String
    private NumberTest oddTester = (n) -> (n % 2) == 0;                         //True||False
    private NumberTest palindromeTester = (n) -> berechnePalindrom(n);          //True||False
    private NumberTest primeTester = (n) -> berechnePrimzahl(n);                //True||False
    
    public NumberTester(String fileName){
        this.fileName = fileName;
    }
    
    public boolean berechnePalindrom(int number){
        String palindrom = Integer.toString(number);
        
        for (int i = 0; i < (palindrom.length()/2); i++) {
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length()-(i+1))) {
                return false;                                                   //False
            }
        }
        return true;                                                            //True
    }
    
    public boolean berechnePrimzahl(int number){
        
        for(int i = 2; i<=number; i++){
                if ((number%i) == 0) {
                    return false;                                               //False
                }
        }
                
        return true;                                                            //True
    }
    
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile(){
        try {
            BufferedReader scanner = new BufferedReader(new FileReader(this.fileName));
            
            String line = scanner.readLine();
            
            int o = Integer.parseInt(line);
            
            for (int i = 0; i < o; i++) {
                line = scanner.readLine();
                
                String [] arr = line.split(" ");
                
                switch(arr[0]){
                    case "1":
                        if (oddTester.testNumber(Integer.parseInt(arr[1]))) {
                            System.out.println("EVEN");
                        }else{
                            System.out.println("ODD");
                        }
                        break;
                    case "2":
                        if (primeTester.testNumber(Integer.parseInt(arr[1]))) {
                            System.out.println("PRIME");
                        }else{
                            System.out.println("NO PRIME");
                        }
                        break;
                    case "3":
                        if (palindromeTester.testNumber(Integer.parseInt(arr[1]))) {
                            System.out.println("PALINDROME");
                        }else{
                            System.out.println("NO PALINDROME");
                        }
                        break;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("file not found");
        }
        
    }
    
    
}
