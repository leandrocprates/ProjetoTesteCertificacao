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

public class Cartesian {
     public static void main(String[] args) {
          TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
          myMap.put("ak", 50); 
          myMap.put("co", 60);
          myMap.put("ca", 70); 
          myMap.put("ar", 80);
          
          NavigableMap<String, Integer> myMap2 = myMap.headMap("d", true);
          myMap.put("fl", 90); // fora do range para myMap2 por isso nao mostra
          myMap2.put("al", 110);
          myMap.put("c5", 10);
          
          System.out.println(myMap.size() + " " + myMap2.size());
          System.out.println(myMap);
          System.out.println(myMap2);
          
          
          
     }
}

