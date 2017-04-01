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
public  class Mutate {
        public static void main(String [] args) {
             StringBuilder s = new StringBuilder("012345678 ");
             if (s.length() == 10)
                  s.insert(10, "abcdef");
             
             System.out.println(s);
             s.delete(3,8);
             System.out.println(s);
             System.out.println(s.indexOf("c"));
        }
}

