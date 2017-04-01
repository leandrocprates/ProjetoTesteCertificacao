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


public class NoGo2 implements Runnable {
    
          private int i;
          
          public synchronized void run() {
              
              System.out.println("Thread ID : " +  Thread.currentThread().getId() ) ;  
              
               if (i%10 != 0) {
                   System.out.println("entrou no mod"); 
                   i++; 
               }
               
               for(int x=0; x<10; x++, i++) {
                   if (x == 4) Thread.yield(); 
               }
               
               System.out.println(i + " ");
          }
          
          public static void main(String [] args) {
               NoGo2 n = new NoGo2();
               for(int x=0; x<101; x++) { 
                   new Thread(n).start(); 
               }
          }
          
}