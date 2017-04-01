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
  class Slug {
        static void crawl() { System.out.print("crawling "); }
}
public class BananaSlug extends Slug {
     public static void main(String[] args) {
           Slug[] sa = { new Slug(), new BananaSlug() };
           for(Slug s: sa){
               //s.crawl(); //This is because polymorphism does not apply to static methods.
                crawl();
           }
      }
      static void crawl() { System.out.print("shuffling "); }
}
