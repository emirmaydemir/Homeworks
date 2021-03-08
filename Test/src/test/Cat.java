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
public class Cat extends Animal implements Pet{
    String name;
    
    public Cat(String name){
        super(4);
        super.walk("kedi");////super methodu ile fonksiyon cagirimi
        this.name=name;    
    }
    @Override
     public String getName(){
         return name;
     }
    @Override
     public void setName(String name){
         this.name=name;
     }
    @Override
     public void play(){
         System.out.println("Playing cat");
     }
    @Override
     public void eat(){
         System.out.println("Kedi mamasi");
     }

    
}
