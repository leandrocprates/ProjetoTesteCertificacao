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


public class Race3 {
    int doMud(int x) { return 1; } // primeira opcao 
    int doMud(long x) { return 2; }  // segunda opcao 
    int doMud(Integer z) { return 3; }  // terceira opcao 
    int doMud(int... y) { return 4; }  // quarta opcao 
     

     public static void main(String [] args) {
          Race3 obj = new Race3();
          System.out.println(obj.doMud(4));
     }
}