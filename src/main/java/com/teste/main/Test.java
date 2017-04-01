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

class Books { }
class TextBook extends Books { }

public class Test {
     public static void main (String[] args) {
          List<Books> objA = new ArrayList<Books>();
          List<TextBook> objB = new ArrayList<TextBook>();
          getAuthor(objA);
          getAuthor(objB);
     }
     
     
    //public static void getAuthor(List<?> list) { }             // is the same as  <? extends Object> 
    public static void getAuthor(List<? extends Books> list) { } // sub tipo de Books  

     
}

