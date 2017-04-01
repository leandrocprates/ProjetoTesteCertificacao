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
class Painting {
     Painting(String var) {
          System.out.println("Pastel");
     }
}
public class Fresco extends Painting {
     Fresco() {
          super("teste"); // chama super classe constructor 
          System.out.println("Buon fresco");
          
     }
     public static void main(String [] args) {
          Fresco obj = new Fresco();
     }
}