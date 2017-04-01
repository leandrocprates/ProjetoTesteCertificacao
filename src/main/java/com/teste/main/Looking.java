/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

import java.util.*;

class Looking {
    public static void main(String[] args) {
         String[] sa = {"d", "c", "a", "b" };
         int x = Arrays.binarySearch(sa, "b");
         Arrays.sort(sa);
         int y = Arrays.binarySearch(sa, "b");
         System.out.println(x + " " + y);
    }
} 