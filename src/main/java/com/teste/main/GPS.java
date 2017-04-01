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
     
     class GPS {
          public static void main(String [] args) {

                //HashMap c = new HashMap();
                //SortedMap c = new TreeMap();
                Map c = new LinkedHashMap();
                c.put("myKey", 42);
                
                System.out.println( c.get("myKey") );
          }
     } 