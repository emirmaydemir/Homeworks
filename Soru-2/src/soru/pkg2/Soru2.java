/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru.pkg2;

import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Soru2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
       int[]dizi=new int[100];// 100 elemanli dizimiz
       for(int i=0;i<100;i++){// dizimizin icine rastgele elemanlari atiyoruz
           dizi[i]=(int)(Math.random()*101);
       }
       System.out.println("Selection sort icin 's' insertion sort icin 'i' basiniz");
        String choose=input.next();//string girisi yapiyoruz kullanici secim yapsin diye
        char storage=choose.charAt(0);// stringin ilk elemanini aliyoruz
        if(storage=='s'){
        selectionSort(dizi);// s ise selection fonkuna gider
        }
        else if(storage=='i'){
        insertionSort(dizi);// i ise insert fonksiyonuna gider
        }
         for(int i=0;i<100;i++){
           System.out.print(" "+dizi[i]);// yapilan islemler sonucu dizimizi ekrana bastiriyoruz
       }
         System.out.println("");
    }
    public static void selectionSort(int [] dizi){
        int temp;
        for (int i=0;i<99;i++){// selection sort ile siraliyoruz yani her elemani sirayla karsilastirma
            for(int j=i+1;j<100;j++){
                if(dizi[j]<dizi[i]){
                   temp=dizi[i];
                   dizi[i]=dizi[j];
                   dizi[j]=temp;
                }
            }
        }
        
    }
     public static void insertionSort(int [] dizi){
    int i, j, a,temp;
    for (i = 1; i < 100; i++) {// insertion sort ile karsllastiriyoruz yani kendisinden onceki indisler ile kiyasliyoruz
        j=i-1;
        a=i;
    while (j >= 0 ) {
        if(dizi[a] < dizi[j]){
            temp=dizi[j];
            dizi[j]=dizi[a];
            dizi[a]=temp;
            a=a-(a-j);
        }
        
        j--;
       }
    
            }
               }
    
}
