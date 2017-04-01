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

public class FreeRange {
          public static void main(String[] args) {
               int x = 7, y = 8;
               if(x < y)
                    if(x+2 > y)
                        if(y < x) System.out.println("y é menor que x ");
                        else if(!false)
                            System.out.print("inner ");
                        else if(true)
                            System.out.print("middle ");
          }
     }
