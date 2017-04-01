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


//nao tem como garantir a ordem dos 2 pois utilizam tecnicas de ordenacao diferentes

public class DumpMap {
     public static void main(String [] args) {
         
         HashMap h = new HashMap();
         h.put("a","aa"); 
         h.put("b","bb"); 
         h.put("c","cc");
         
          Set ks = h.keySet();
          Object [] ka1 = ks.toArray();
         
          // TreeSet é ordenado 
          ks = new TreeSet(ks);
          Object [] ka2 = ks.toArray();
          
          //the two arrays are equal if they contain the same elements in the same order
          System.out.println(Arrays.equals(ka1, ka2));
     }
}

