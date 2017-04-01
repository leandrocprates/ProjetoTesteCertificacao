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


public class NoGo implements Runnable {
          private static int i;
          public synchronized void run() {
               if (i%10 != 0) { 
                   i++; 
               }
               
               for(int x=0; x<10; x++, i++){ 
                   System.out.print(i + " ");
                        if (x == 4) 
                            Thread.yield(); 
               } // deixa outra thread executar , like sleep(indeterminado)
           
          }
          
          public static void main(String [] args) {
               NoGo n = new NoGo();
               for(int x=0; x<101; x++) {
                    new Thread(n).start();
                    //System.out.print(i + " ");
     
               } 
          } 
}




