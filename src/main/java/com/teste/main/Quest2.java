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
public class Quest2 {
     public static void main(String[] args) {
          TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
          myMap.put("ak", 50); myMap.put("co", 60);
          myMap.put("ca", 70); myMap.put("ar", 80);
          NavigableMap<String, Integer> myMap2 = myMap.headMap("d", true);
          myMap.put("fl", 90);
          myMap.put("a2", 100);
          myMap2.put("hi", 100); //nao pode colocar pois esta fora do range 
          myMap2.put("a3", 110); // esta dentro do range 
          System.out.println(myMap.size() + " " + myMap2.size());
     }
}


