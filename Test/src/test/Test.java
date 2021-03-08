/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Spider e=new Spider();
        Animal a = new Fish();
        Animal s = new Spider();
        Pet p = new Cat("Fluffy");
        Animal[] animal={
             new Spider(),
             new Cat("Fluffy"),
             new Fish()
         }; 
        System.out.println("");
         //************************************************************************************************************************
        
        System.out.print("kedi ismi: ");
        System.out.println(c.name);
        System.out.println("Bacak sayisi: "+c.legs);
        System.out.println("Kedi ismini degistirmek icin kelime gir:  ");
        name=input.nextLine();
        c.setName(name);
        System.out.println("Yeni kedi ismi: "+c.getName());
        System.out.println("Simdi ise kedi oyun oynayacak ve yemek yiyecek");
        c.play();
        animal[1].eat();
        System.out.println("///////////////////////////////////////////////////  ");
        System.out.println("Simdi ise orumcek yemegini yiyecek");
        animal[0].eat();
        System.out.println("Bacak sayisi: "+s.legs);
        System.out.println("///////////////////////////////////////////////////  ");
        System.out.print("Baligin ismi: "); f.getName();
        System.out.println("Bacak sayisi: "+f.legs);
        f.walk("balik");
        System.out.print("Balik ismini degistirmek icin kelime gir:  "); name=input.nextLine();
        f.setName(name); System.out.println("Baligin yeni ismi: "+f.getName());
        animal[2].eat();
        
        //************************************************************************************************************************
        
         
                  
         
    }
    
}
