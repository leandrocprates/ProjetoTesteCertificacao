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

class Tree2 {
            private static String tree = "tree "; // como e private nao pode ser acessado por outra classe assim = Tree2.tree . 
          String getTree() { 
                  return tree; 
          }
          
          void printTree(){
              System.out.println(Tree2.tree);
          }
}

public class Elm extends Tree2 {
     private static String tree = "elm ";
     
     public static void main(String [] args) {
          new Elm().go(new Tree2());
     }
     
     void go(Tree2 t) {
          String s = t.getTree() + Elm.tree + tree + (new Elm().getTree())   ;
          System.out.println(s);
          t.printTree() ; 
          
     }
     
     // Elm.tree so pode ser acesado dentro da propria classe pois é privada 
     
}
