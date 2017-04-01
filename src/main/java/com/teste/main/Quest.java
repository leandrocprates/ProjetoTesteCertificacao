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

public class Quest {
     public static void main(String[] args) {
          TreeSet<String> mySet = new TreeSet<String>();
          mySet.add("aa"); 
          mySet.add("dd");
          mySet.add("cc"); 
          mySet.add("aa");
          
          //pega valores menor ou igual a cc 
          NavigableSet<String> mySet2 = mySet.headSet("cc", true);
          mySet2.add("bb");
          
          System.out.println(mySet);
          System.out.print(mySet2);
     }
}