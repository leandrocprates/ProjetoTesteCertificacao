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



public class Seasons {
          enum SeasonsA {SUMMER, WINTER, SPRING }
          enum SeasonsB {AUTUMN, MONSOON}
          static void display() {
               for(SeasonsA var : SeasonsA.values())
                    System.out.println(var + " ");
          }
          public static void main(String[] args) {
               //SeasonsA.WINTER = SeasonsB.AUTUMN;
               SeasonsB teste  = SeasonsB.AUTUMN;
               display();
          }
}



