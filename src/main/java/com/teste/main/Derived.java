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

// metodos static nao sao herdados 
// Métodos estáticos não podem ser sobrescritos, mas podem ser reescritos.
// polimorfismo nao funciona com métodos staticos

 class Base {
          protected static  String info() {
               return "Base";
          }
}

public class Derived extends Base {
    
    //modificador de acesso deve ser igual ou mais fraco como public
     public static  String info() {
          return "Derived";
     }
     
     public static void main(String[] args) {
          Base obj = new Derived();
          System.out.print(obj.info());
     }
}



