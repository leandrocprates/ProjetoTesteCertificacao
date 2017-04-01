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


class Chemical {
          int ph() { return 7; }
}

public class Acid {
     public static void main(String[] args) {
          new Acid().go();
     }
     void go() {
         System.out.println("Dentro de go .....");
         //super so pode ser usado quando existe uma superclasse 
         //System.out.println(ph() + " " + super.ph() + " " + getPh());
         System.out.println(ph() + " " + getPh());
     }
     int getPh() { return 4; }
     int ph() { return 3; }
}

