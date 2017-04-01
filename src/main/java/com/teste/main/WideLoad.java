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


public class WideLoad {
    
    //Primeiro tenta um tipo primitivo int , se nao exsite tenta um tipo primitivo 
    //superior a int , no caso nosso double   
    // caso nao exista procura um da classe  Integer = int 
    // caso nao exista procura um vargs de Ineteger 
    
    
    
          public static void main(String [] args) {
               //float f = 3.14f;
               int f = 4 ; 
               new WideLoad().doIt(f);
          }
          
          void doIt(Float f) {
               System.out.println("Float");
          }

          void doIt(Integer f) {
               System.out.println("Integer");
          }

          void doIt(double d) {
               System.out.println("double");
          }

          void doIt(short d) {
               System.out.println("short");
          }

          void doIt(int d) {
               System.out.println("int");
          }

          
          void doIt(Integer... f) {
               System.out.println("Vargs Integer");
          }
          

          void doIt(Float ... f) {
               System.out.println("Vargs Float ");
          }


}