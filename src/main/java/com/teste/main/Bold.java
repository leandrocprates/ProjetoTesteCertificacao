/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

/**
 *   Sempre executar como java -ea Bold (enable assertion)
 * @author lprates
 */

public class Bold {
          public static void main(String[] args) {
              
              try{
                    Boolean boo = true;
                    assert(!boo): "yee ";
                    System.out.println("haw ");

              }catch (Exception ex ){
                  System.out.println("saida...");
              }
          }
     }

