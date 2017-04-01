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

public  class Needle implements Runnable {
          public static void main(String [] args) {
               //Thread t = new Thread(new Thread()); 
               Thread t = new Thread(new Needle()); 
               t.start();
          }
          public void run() { 
              System.out.println("sart thread ") ; 
              
              }
     }
