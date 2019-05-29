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


public  class CopyArray {
          public static void main(String [] args) {
                int[] x = {1, 2 ,3};
 
               	int[] y1 = x;
                int[] y2; 
                y2 = x;
        
                System.out.println("y2------");
                for (int v: y2){
                    System.out.println(v);
                }

                System.out.println("y1------");
                for (int v: y1){
                    System.out.println(v);
                }
                
                System.out.println("x------");
                for (int v: x){
                    System.out.println(v);
                }
                
                
          }
     }