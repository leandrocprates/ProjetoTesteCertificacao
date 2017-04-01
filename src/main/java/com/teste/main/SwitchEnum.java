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

enum Color {red, green, blue, gray}

class SwitchEnum {
    
        public static void main(String [] args) {
            Color c = Color.gray;
            switch(c) {
                case red: System.out.print("red ");
                case green: System.out.print("green ");
                default: System.out.println("done");
                case blue: System.out.print("blue ");
                //default: System.out.println("done");break;
            }
           
            
            String [] sNums = {"one", "two", "three"};
            String teste = null; 
            
           
            
        }
}