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


public class Test3 implements Runnable {
          String str = "Hello";
          
          public void start(){
              System.out.println("Funcao start .....");
          }
          
          public void run() {
               if(str.substring(5,6).equals('O'))
                    System.out.print(true);
               else
                    System.out.print(false);
          }
          public static void main(String [] args) {
               Test3 t = new Test3();
               Thread th = new Thread();
               
               t.start(); // executa start normalmente
               th.start(); // executar a thread , funcao run()
          }
     }
