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

class Bird {
    
    //bloco static sempre o primeiro a ser executado assim que a classe carrega na jvm  
    static { 
        System.out.print("static bird,  "); 
    }
    
    //primeiro cria esse bloco depois o construtor 
    { 
        System.out.print("b1, "); 
    }

    public Bird() 
    { 
        System.out.print("b2, "); 
    }

}

class Raptor extends Bird {
    
    //bloco static sempre o primeiro a ser executado assim que a classe carrega na jvm 
    static { 
        System.out.print("static raptor r1, "); 
    }
    
    public Raptor() 
    { 
        System.out.print("r2, "); 
    }
    
    //primeiro cria esse bloco depois o construtor 
    { 
        System.out.print("r3, "); 
    }
    
    static { 
        System.out.print("static raptor r4, "); 
    }

}

class Hawk extends Raptor {
    public static void main(String[] args) {
        
        System.out.println("pre, ");
        new Hawk();
        System.out.println("hawk, ");
    }
}




