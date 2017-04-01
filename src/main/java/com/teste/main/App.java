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
enum Color2 {
     RED(5), GREEN(3), BLUE(1);
     private final int value;
     Color2(int value) { this.value = value; };
     public int value() { return value; } // funcao public para acesso do valor 
}
public class App {
     public static void main(String [] args) {
     // nao instaciar enums 
     //Color2 obj = new Color2();
     for(Color2  var : Color2.values()  )
          System.out.println(var + " "  + var.value()  );
     }
     
}