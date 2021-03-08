/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Soru_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int sayi=0;
       Scanner input=new Scanner(System.in);
       ArrayList<Integer> array=new ArrayList<>();
       System.out.println("10 adet sayi girisi yapiniz");
       for(int i=0;i<10;i++){
           System.out.print((i+1)+". sayi girisini yapiniz: ");
           sayi=input.nextInt();
           array.add(i,sayi);
       }
       System.out.println("Eski dizimiz= "+array);
         System.out.println(array.get(1));
       removeDuplicate(array);
       System.out.println("Essiz dizimiz= "+array);
    }
   
    public static void removeDuplicate (ArrayList <Integer> listesi){
        for(int i =0;i<listesi.size()-1;i++){
            for(int j=i+1;j<listesi.size();j++){
                if(listesi.get(i)==listesi.get(j)){
                    listesi.set(j,0);
                }
            }
        }
        for(int i=listesi.size()-1;i>0;i--){
            if(listesi.get(i)==0){
                listesi.remove(i);
            }
        }
    }
    
}
