/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru.pkg1;

import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int dizi[]=new int[100];// 100 elemanlı dizimizi olusturduk
        int aranan;
        Scanner input=new Scanner(System.in);
         for(int i=0;i<100;i++){             // for dongusu ile rastgele degerleri atadik
            dizi[i]=(int)(Math.random()*101);
        }
        System.out.println("");
        System.out.println("Aranan degeri giriniz");
        aranan=input.nextInt();// aranan degeri kullacidan aldik
        System.out.println("Dogrusal arama sonucu: ");             
        dogrusalArama(dizi,aranan); // dogrusal atama fonk cagirdik
        System.out.println("--------------------------------------------------");
        System.out.println("ikili arama sonucu arama sonucu: ");
        ikiliArama(dizi,aranan);// ikili arama fonk cagirdik
        
    }
     public static void dogrusalArama(int [] dizi,int aranan){
        int a=0;
         boolean secim=false;// bu islemi aranan sayi bulunamazsa diye yapiyoruz
         for(int i=0;i<100;i++){
            System.out.print(" "+dizi[i]);// dizimizi ekrana bastirdik
        }
          System.out.println("");
        for(int sayi:dizi){ // dizinin her elemanini sirayla kontrol ediyoruz
            if(aranan==sayi){// aranan sayi dizinin elemanina esit ise ife giriyoruz
                System.out.println("Aranan sayi bulunmustur ilk olarak "+a+". indexte ");
                secim=true;
                break;
            }
           a=a+1;
        }
        if(secim==false){// eger esit eleman bulunamadıysa deger false olarak kalir ve deger bulunamadi yazar
            System.out.println("Aranan sayi bulunamamistir");
        }
        
        
    }
    
    public static void ikiliArama(int [] dizi,int aranan){
        int min=0;
        boolean secim= true;
        int temp;
        int max=dizi.length-1;
        for (int i=0;i<99;i++){// burada dizimizi kucukten buyuge siraliyoruz
            for(int j=i+1;j<100;j++){
                if(dizi[j]<dizi[i]){
                   temp=dizi[i];
                   dizi[i]=dizi[j];
                   dizi[j]=temp;
                }
            }
        }
        for(int i=0;i<100;i++){// siraladigimiz dizimizi ekrana bastiriyoruz
            System.out.print(" "+dizi[i]);
        }
        System.out.println("");
        
        while(min<=max){// burada ise siralanmis dizimiz icerisinde ort deger ile arama yapiyoruz
            int ort=(min+max)/2;// dizimizin ortasindan basliyoruz ve surekli yarı yarıya dusuruyoruz
            if(aranan<dizi[ort]){
                max=ort-1;// index sistemi 0 ile basladigi icin -1 yaptik
            }
            else if(aranan>dizi[ort]){
                min=ort+1;// index sistemi 0 ile basladigi icin +1 yaptik
            }
            else{// deger bulundugunda ekrana bastiracak
                System.out.println("Aranan sayi bulundu ilk olarak "+ort+". indexte ");
                secim=false;
                
                break;
            }
           
        }
        if(secim){
        System.out.println("Aranan sayi bulunamadi ");
        }
    }
    
}
