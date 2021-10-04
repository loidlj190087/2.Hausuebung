/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
 *
 *
 * @author loidl
 */

package net.htlgrieskirchen.loidlj190087;

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
        //Todo
    }
    
    
    /*
    public void leseDateiEin() throws IOException
  {
    FileReader fr = new FileReader("test.txt");
    BufferedReader br = new BufferedReader(fr);

    String zeile = "";

    while( (zeile = br.readLine()) != null )
    {
      System.out.println(zeile);
    }

    br.close();
  }
   */
    
}
//6terCommit