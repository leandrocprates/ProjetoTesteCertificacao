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
class Bird2 {
        protected void talk() { System.out.println("Bird2 - chirp "); }
   }

public class Macaw extends Bird2 { // polimorfismo funciona 
     public static void main(String [] args) {
            Bird2 [] birds = {new Bird2(), new Macaw()};
            for( Bird2 b : birds)
                 b.talk();
     }
     // dever possuir o mesmo privilegio de acesso ou maior como public
       protected void talk() { System.out.println("Macaw - hello "); }
}


