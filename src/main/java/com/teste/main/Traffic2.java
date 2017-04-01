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


 public class Traffic2 implements Runnable {
          static String s = "";
          static final int HOW_BUSY = 100000000;
          public void run() {
               for(int j = 0; j < HOW_BUSY * 9; j++)
               if((j % HOW_BUSY) == 0) s += "2";
          }
          public static void main(String[] args) {
               Thread t = new Thread(new Traffic2()); t.start();
               for(int k = 0; k < HOW_BUSY * 9; k++) if((k % HOW_BUSY) == 0) s += "1";
               try { t.join(); } catch (Exception e) { }
               System.out.println(s);
          }
     } 