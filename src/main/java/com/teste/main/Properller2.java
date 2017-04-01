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



public class Properller2 {
          public static void main(String [] args) throws Exception // add code here?
          { new Properller2().topGo(); }
     
          void topGo() throws Exception // add code here?
          { middleGo(); }
     
          void middleGo() throws Exception // add code here?
          { go(); System.out.println("late middle "); }
     
          void go() throws Exception // add code here?
          { throw new Exception(); }
}
