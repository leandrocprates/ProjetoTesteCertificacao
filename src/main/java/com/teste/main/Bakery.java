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


class Pastry {
           public static class Filling {
                public void berry() { 
                    System.out.println("yum "); 
                }
          }
}

public  class Bakery {
          public static void main(String [] args) {
       
              Pastry.Filling f = new Pastry.Filling();
              
              //Pastry p = new Pastry(); Filling f = new p.Filling(); // nao acha Filling 
              
              //Pastry p = new Pastry(); 
              //Pastry.Filling f = new p.Filling(); // acha que p é pacote 


              //funciona caso a classe nao seja static 
              //Pastry p = new Pastry(); 
              //Pastry.Filling f2 =  p.new Filling();   // criar instacia de Filling 

              
               f.berry();
          }
     }