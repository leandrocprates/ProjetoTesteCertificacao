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
public abstract class ClasseAbstrata {
    
    public abstract int funcaoAbstrata ();
    

    public  final int funcaoFinal(){
        return 2  ; 
    }
    
    private int funcaoPrivate(){
        System.out.println("ClasseAbstrata - funcaoPrivate() ");
        return 3 ; 
    }
    
}
