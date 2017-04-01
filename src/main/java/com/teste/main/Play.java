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


public class Play {
     public static void main(String[] args) {
          try {
               System.out.println("start");
               throw new Exception();
               
// nao pode tratar exceçao que nao é lançada                
//          } catch (IOException ie) {          
//               System.out.println("pause");
//          }
            
// exceçoes devem ser tratadas 
          } catch (Exception ie) {          
               System.out.println("pause");
          } finally {
               System.out.println("stop");
          }
     }
}