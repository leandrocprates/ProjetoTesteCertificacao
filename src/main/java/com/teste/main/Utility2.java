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


class UtilityAbstract {
//           public static void main(String[] args) {
//                System.out.println(x + " ");
//                new Utility().go(x);
//                System.out.println(x);
//           }
    
            //nao da para chamar esse metodo em outra classe , somente uma funcao interna 
           private void go(int x) {
                x += 5;
                System.out.println(x);
           }
           static int x = 7;
}



public class Utility2{
    
    public static void main(String args[]){
        
        UtilityAbstract  ab = new UtilityAbstract();
        // ab.go(5); // metodo private nao acessivel
    }
    
    
} 



