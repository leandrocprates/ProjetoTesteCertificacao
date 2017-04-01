/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lprates
 */
//acha somente a primeira ocorrencia 
public class MyPattern {
     public static void main(String[] args) {
          String line = "Financial Year 2012 - 2013";
          String pattern ="\\d+";
          Pattern r = Pattern.compile(pattern);
          Matcher m = r.matcher(line);
          if (m.find()) {
               System.out.println("Found value: " + m.group(0));
          } else {
               System.out.println("NOT FOUND");
          }
     }
}