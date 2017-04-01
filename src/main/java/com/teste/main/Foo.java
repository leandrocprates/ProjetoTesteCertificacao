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

class SuperFoo {
          SuperFoo doStuff(int x) {
               return new SuperFoo();
          }
}
     
public  class Foo extends SuperFoo {

        //overload de funcao 
    	int doStuff() { return 42; }
        
        //sobreescreve a funcao com o subtipo 
        @Override
        Foo doStuff(int x) { return new Foo(); }
        
        //@Override
        //SuperFoo doStuff(int x) { return new Foo(); }
    
    public static void main (String args[]){
        
    }
    
    
}