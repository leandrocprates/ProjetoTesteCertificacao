/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.ClasseAbstrata;
import com.mycompany.mavenproject1.ClasseExtendida;

/**
 *
 * @author lprates
 */
public class ClassePrincipal {
    
    
    
    
    public static void main(String args[]){
        
        ClasseAbstrata ca  = new ClasseExtendida();
        System.out.println(ca.funcaoAbstrata());
        System.out.println(ca.funcaoFinal()); 
        

        int year[] = new int[100];
        
        Object [] pets = new Object[3];
        
        System.out.println(ClasseExtendida.CoffeeSize.BIG);
        
        float x = 5  ; 
        int z = (int) x ; 
        double y = x ; 
        
        
        System.out.println(z);
        
        
        for(int i=0;i<100;i++)
            System.out.println("year[" + i + "] = " + year[i]);
        
        
        for(int i=0;i<3;i++)
            System.out.println("pets[" + i + "] = " + pets[i]);
        
        
        
    }
    
    
}
