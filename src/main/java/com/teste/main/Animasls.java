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

enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound; // acesso de pacote protected , se private criar funcao para acessar 
    Animals(String s) { sound = s; }
}

public class Animasls {
    static Animals a = Animals.DOG;
    public static void main(String [] args) {
       System.out.println(a.DOG.sound  + " " + Animals.FISH.sound);
       System.out.println(a.name() + " " + a.toString());
       System.out.println(Animals.DOG + " " + Animals.FISH );
       
       
    }
}
