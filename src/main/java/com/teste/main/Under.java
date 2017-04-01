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
class Over {
          protected int doIt(long x) { return 3; }
}
     
class Under2 extends Over {
    

    short doIt(int y) { return 4; }
    int doIt(long x, long y) { return 4; }
    private int doIt(short y) { return 4; }
    
    //nao pode atribuir um privilegio menor quando override a function , private , package access
    @Override
    public int doIt(long x) { return 4; }     
    
    
}


public class Under  {
     
    public static void main(String... args){
        System.out.println("Under...");
        
    }
            
    
}


