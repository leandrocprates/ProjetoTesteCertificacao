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
public class Marjoram {
    public static void main(String [] args) {
         Marjoram g = new Marjoram();
         Alpha2 a =  g.go(1); 
         a.imprimir();

         a =  g.go(5); 
         a.imprimir();
    }
    
    //nao aceita como tipo de retorno da funcao
    public  /*<A extends Alpha2>*/   Alpha2  go(int i) {
         if (i == 1) return new Alpha2();
         else return new Beta();
    }
}

class Alpha2 { 
    public void imprimir(){
        System.out.println("Alpha2");
    }
}
class Beta extends Alpha2 { 
    public void imprimir(){
        System.out.println("Beta");
    }
}


