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

class Fizz {
        int x = 5;
        public static void main(String[] args) {
            final Fizz f1 = new Fizz();
            Fizz f2 = new Fizz();
            Fizz f3 = FizzSwitch(f1,f2);
            System.out.println((f1 == f3) + " " + (f1.x == f3.x));
        }

        static Fizz FizzSwitch(Fizz x, Fizz y) {
            final Fizz z = x;
            z.x = 6;
            return z;
        } 
}