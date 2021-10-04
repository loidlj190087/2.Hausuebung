/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.htlgrieskirchen.loidlj190087;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author loidl
 */
public class HalloJavamitForEach {
    
    public static void main(String[] args) {
    
        List<String> liste = new ArrayList<String>();

        for (String var : liste) {
            System.out.println(var);
        
        liste.forEach((String s) -> System.out.println(s));
        
        Consumer<String> consumer = (String s) -> System.out.println(s);
        
        //liste.forEach(System.out::print);
        
    }
    
        
        
    }
}
