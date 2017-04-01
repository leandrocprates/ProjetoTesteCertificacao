/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

/**
 *
 * @author lprates
 */
//Scanner usa espaço em branco como default separator 

import java.util.*;
public class ScanStuff {
    public static void main(String [] args) {
        
    String s = "x,yy, 123";
    Scanner sc = new Scanner(s);
    while (sc.hasNext())
         System.out.println(sc.next() + " ");
    }
    
} 