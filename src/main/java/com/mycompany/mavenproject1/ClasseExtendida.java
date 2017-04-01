/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lprates
 */
public class ClasseExtendida extends ClasseAbstrata {

    public  enum CoffeeSize { BIG, HUGE, OVERWHELMING };
    
    
    @Override
    public int funcaoAbstrata() {
        
        funcaoPrivate();
        return 1 ; 
    }
    
    public int funcaoExtendida(){
        return 4; 
    }
    
    
    
    private int funcaoPrivate(){
        System.out.println("ClasseExtendida - funcaoPrivate() ");
        return 35 ; 
    }
    
    
}
