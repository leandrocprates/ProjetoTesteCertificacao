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

class Alpha {
    static String s = " ";
    protected Alpha() { s += "alpha "; }
}

//classe nao é chamada 
class SubAlpha extends Alpha {
    private SubAlpha() { s += "sub "; }
}

public class SubSubAlpha extends Alpha {
    
    private SubSubAlpha() 
    { 
        super();
        s += "subsub "; 
    }

    public static void main(String[] args) {
        new SubSubAlpha();
        System.out.println(s);
        
        s = "teste" ; 
        
        System.out.println(s);
        
    }
    
}