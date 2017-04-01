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
class Car { }
class Honda extends Car { }

public class Teste5 {
      public static void main (String[] args) {
          List<Car> cars = new ArrayList<Car>();
          List<Honda> cars2 = new ArrayList<Honda>();
          List<Object> cars3 = new ArrayList<Object>();
          takeCars(cars);
          takeCars(cars2);
          takeCars(cars3);
     }
      
     // sinal ? significa qualquer objeto  
     //public static void takeCars(List<?> list) { }
     public static void takeCars(List<? extends Object> list) { }
      
    
}
