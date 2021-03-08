/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author risin
 */
public abstract class Animal {
    protected int legs;
    public abstract void eat();
    
    protected Animal(int ayakSayisi){
        legs=ayakSayisi;
    }
     public void walk(String name){
         System.out.println(name+" yürüme başladi");
     }
}
