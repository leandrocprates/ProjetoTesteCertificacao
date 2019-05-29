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


public class Pins implements Runnable {
        public static void main(String[] args) {
             Pins p = new Pins();
             Thread t1 = new Thread(p);
             Thread t2 = new Thread(p);
             t1.start();
             t2.start();
             t1.start(); // nao pode dar start 2 vezes na mesma thread 
        }
        public void run() { System.out.print("x"); }
}
