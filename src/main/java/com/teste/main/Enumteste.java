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



public class Enumteste {
    
    enum Animals {
              DOG,
              BIRD { 
                  public int getLegs() { 
                      return 2; 
                  } 
              },
              HORSE;
              public int getLegs() { return 4; }
    }


    public static void main(String[] args) {
           System.out.println(Animals.DOG.getLegs() + " " + Animals.BIRD.getLegs());
    }

}

