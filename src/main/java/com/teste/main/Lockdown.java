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


public class Lockdown implements Runnable {
          public static void main(String[] args) {
               new Thread(new Lockdown()).start();//2 objetos diferentes , execucoes paralela dos dois 
               new Thread(new Lockdown()).start();// ordem de saida indefinida
          }
          public void run() { locked(Thread.currentThread().getId()); }
          synchronized void locked(long id) {
               System.out.print(id + "a ");
               System.out.print(id + "b ");
          }
     }