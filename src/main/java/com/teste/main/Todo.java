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
//mudar o array muda a lista  

import java.util.*;
public class Todo {
     public static void main(String[] args) {
          String[] dogs = {"fido", "clover", "gus", "aiko"};
          List dogList = Arrays.asList(dogs);
          //dogList.add("spot"); // gera exception 
          dogs[0] = "fluffy";
          System.out.println(dogList);
          for(String s: dogs) System.out.print(s + ", ");
     }
}















