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


public class Utility {
           public static void main(String[] args) {
                System.out.println(x + " ");
                new Utility().go(x); // se chamar go na mesma classe funciona , em outra nao 
                System.out.println(x);
           }
           private void go(int x) {
                x += 5;
                System.out.println(x);
           }
           static int x = 7;
      }
