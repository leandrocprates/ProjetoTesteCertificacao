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


interface MyInterface2 {
          static long boat = 7L;
          long myMethod(long x);
 }

public class TestCLine implements MyInterface2 {
     public static void main(String[] args) {
         
          new TestCLine().myMethod( Long.parseLong("6") );
     }
 
     public long myMethod(long x) {
          System.out.println( ((++x * boat) - (--x + 1)) );
          return 42L;
     }
}