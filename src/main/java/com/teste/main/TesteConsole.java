/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

import java.io.Console;

/**
 *
 * @author lprates
 */
public class TesteConsole {
    
    
    public static void main (String args[]){
        
        Console c = System.console();
        
        
        
        Console    cnsl = System.console();

          String   name = cnsl.readLine("Name: ");
            
            // prints
            System.out.println("Name entered : " + name);        
        
        //char[] pw = c.readPassword("%s", "pw: ");
        //for(char ch : pw)
        //  System.out.print(ch);        
        
    }
    
}
