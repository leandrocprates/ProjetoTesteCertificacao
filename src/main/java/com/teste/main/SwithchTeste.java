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
public class SwithchTeste {


    public static void main(String teste[]){
        
        
        /*
        Imprime tudo ate encontrar o break ; saida : 76def 
        */
        
            int x = 7;
               switch (x) {
                    case 8: System.out.print("8");
                    case 7: System.out.print("7");
                    case 6: System.out.print("6");
                    default: System.out.print("def");break;
                    case 9: System.out.print("9");
               }        
        
    }


    
}


