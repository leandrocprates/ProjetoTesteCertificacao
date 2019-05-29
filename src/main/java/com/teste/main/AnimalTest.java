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


class Animal2 { 
    Animal2 getOne() {
        System.out.println("Animal2");
        return new Animal2(); 
    } 
}
class Dog2 extends Animal2 {
    // sobreescreve o metodo com um subtipo , permitido 
        Dog2 getOne() {
            System.out.println("Dog2");
            return new Dog2(); 
        }
        
        //Animal2 getOne() {
        //    System.out.println("Dog2");
        //    return new Dog2(); 
        //}    

}
     
public class AnimalTest {
    public static void main(String [] args) {
         Animal2 [] animal = { new Animal2(), new Dog2() } ;
         for( Animal2 a : animal) {
              Animal2 x = a.getOne();
         }
    }
}
