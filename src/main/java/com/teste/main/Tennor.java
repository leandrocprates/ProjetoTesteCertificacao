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

class Singer { 
    public static String sing() // nao exisrte polimorfismo para metodos static
    { 
        return "la"; 
    } 
}

public class Tennor extends Singer {
    
    public static String sing() { return "fa"; }

    public static void main(String[] args) {
        Tennor t = new Tennor();
        Singer s = new Tennor();
        System.out.println(t.sing() + " " + s.sing());
    }
}

