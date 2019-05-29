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
import java.util.*;
public class Gen2 {
        public static void go(Set<Animal> a) { }
        public static void main(String [] args) {

            /*
            so aceita se for do mesmo tipo <Animal> ou Generico <> 
            */

          TreeSet t = new TreeSet(); // pode enviar aceita tipo generico  
          //TreeSet<Dog> t = new TreeSet<Dog>();
          //TreeSet<? extends Animal> t = new TreeSet<Dog>(); // aceita, qualquer class que extend Animal, funcao nao aceita 
          //TreeSet<Animal> t = new TreeSet<Dog>(); // nao funciona tipos incompativeis 
          //TreeSet<Animal> t = new TreeSet<Animal>();  // esse funciona mesmo tipo recebido na funcao             

            go(t);
        }
}

class Animal { }
class Dog extends Animal { }
