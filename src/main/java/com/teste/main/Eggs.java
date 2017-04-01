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
public class Eggs {
          public static void main(String[] args) {
               int[][] basket1 = new int[2][];
               basket1[0] = new int[3];
               //basket1[0] = {1,2,3}; // nao pode 
               basket1[0] = new int[] {6,7,8}; 
     
               int[][] basket2 = new int[2][];
               basket2[0] = new int[] {1,2,3};
               basket2[0][1] = 7;
               System.out.println(basket1[0][1] + " " + basket2[0][1]);
          }
}