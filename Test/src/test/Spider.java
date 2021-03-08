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
public class Spider extends Animal{
    
    
     public Spider(){
         super(8);
         super.walk("örümcek");////super methodu ile fonksiyon cagirimi
     }
     @Override
     public void eat(){
         System.out.println("Orumcek yemegi");
     }
     
    
}
