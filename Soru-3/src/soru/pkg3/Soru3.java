/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru.pkg3;

/**
 *
 * @author risin
 */
public class Soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double uzaklik;
        double min=10;
        int [][] yakinNoktalar=new int[2][2];// en yakin 2 nokta bunun icinde olacak
        int [][] noktalar=new int [5][2];// 5 adet nokta olacak matrisimizde
        for(int i=0;i<5;i++){// matrisimize rastgele degerleri atiyoruz
            for(int j=0;j<2;j++){
                noktalar[i][j]=(int)(Math.random()*20)-10;                        
            }
        }
        for(int i=0;i<5;i++){// noktlari ekrana bastiriyoruz
            for(int j=0;j<2;j++){
              System.out.print(noktalar[i][j]+" ");
            }
             System.out.println("");
        }
        for(int i=0;i<5;i++){ // 2 nokta secerek tum kombinasyonlari deniyoruz ve en yakin 2 noktayi buluyoruz 
            for(int j=i+1;j<5;j++){// uzaklik bulma formulu ile tum noktalari kiyasliyoruz
               uzaklik=Math.sqrt(Math.pow(noktalar[i][0]-noktalar[j][0],2)+(Math.pow(noktalar[i][1]-noktalar[j][1],2)));
          
               if(uzaklik<min){// en az uzaklık en yakin 2 nokta demektir onu bulup yeni matrise atiyoruz
                   min=uzaklik;
                   yakinNoktalar[0][0]=noktalar[i][0];
                   yakinNoktalar[0][1]=noktalar[i][1];
                   yakinNoktalar[1][0]=noktalar[j][0];
                   yakinNoktalar[1][1]=noktalar[j][1];
               }
            }          
        }
        System.out.print("Birbirine en yakin 2 nokta"+" ("+yakinNoktalar[0][0]+","+yakinNoktalar[0][1]+")");
        System.out.println("("+yakinNoktalar[1][0]+","+yakinNoktalar[1][1]+")");
    }
    
}
