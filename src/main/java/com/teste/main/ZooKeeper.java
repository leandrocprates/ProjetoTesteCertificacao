/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teste.main;

/**
 * Polimorfismo somente com metodos , nao com variaveis 
 * @author lprates
 */
class Mammal {
    String name = "furry ";
    String makeNoise() { return "generic noise"; }
}

class Zebra extends Mammal {
    String name = "stripes ";
    String makeNoise() { return "bray"; }
}

public class ZooKeeper {

    public static void main(String[] args) { new ZooKeeper().go(); }

    void go() {
        Mammal m = new Zebra();
        System.out.println(m.name + m.makeNoise());
    }

}