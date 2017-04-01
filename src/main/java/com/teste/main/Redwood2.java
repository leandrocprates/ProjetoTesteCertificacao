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



public class Redwood2 extends Tree3 {
          public static void main(String[] args) {
                Tree3 t1 = new Tree3();
                Tree3 t2 = new Redwood2();
                Redwood2 r1 = new Redwood2();

                Redwood2 r3 = (Redwood2) t2;
                Tree3 t3 = t2;
                Tree3 t4 = (Tree3) t2;                
          }
}

class Tree3 { } 