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


class Book {
          private final void read() { System.out.print("book "); }
}

public   class Page extends Book {
    public static void main(String [] args) {
         new Page().read();
         //new Book().read(); //metodo private nao pode ser acessado
    }
    private final void read() { System.out.print("page "); }
}


