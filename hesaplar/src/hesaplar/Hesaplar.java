/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplar;

import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Hesaplar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int id;
        int secim=0;
        int hesapSecim;
        double tutar;
        double aylikFaizOrani;
        double aylikFaiz;
        double bakiye;
        Scanner input=new Scanner(System.in);
        System.out.println("Hesabin bakiyesini ve id'sini kendiniz olusturmak istiyorsaniz (1) rastgele hesap id ve bakiyesi istiyorsaniz (2) basiniz!!! ");
        hesapSecim=input.nextInt();
        hesap hesapp=new hesap();
        if(hesapSecim==1){// eger 1'i secersek hesabi kendimiz olusturuyoruz aksi taktirde random bir hesap olusur
        System.out.println("Hesap id gir");
        id=input.nextInt();
        System.out.println("Hesap baslangic bakiye gir");
        bakiye=input.nextDouble();
        hesapp=new hesap(id,bakiye);
        }
        aylikFaizOrani=hesapp.getAylikFaizOrani();// aylik faiz oranini donduruyorum
        aylikFaiz=hesapp.getAylikFaiz(aylikFaizOrani); // aylik faiz oranini kullanarak fazi oranini donduruyorum
        System.out.println("Aylik faiz oranini gormek icin (1)");
        System.out.println("Aylik faizi gormek icin (2)");
        System.out.println("para cekmek icin (3)");
        System.out.println("para yatirmak icin (4)");
        System.out.println("id/bakiye/hesap acilma tarihi hepsini gormek icin (5)");
        System.out.println("cikis yapmak icin (6)");
        System.out.println("BASINIZ!!!!");
        System.out.println("---------------------------------------");
        
        while(secim!=6){//secim 6 exit yapacak digerleri islem secenekleri
           System.out.print("Islem icin rakam girisi yapiniz: ");
           secim=input.nextInt();
            switch (secim) {
        case 1 ://ayli faiz oranini donduruyor 1
           aylikFaizOrani=hesapp.getAylikFaizOrani();
           System.out.println("Aylik faiz oranini: "+aylikFaizOrani);
            break;

        case 2 ://ayli faizi donduruyor 2
             System.out.println("Aylik faiz: "+hesapp.getAylikFaiz(aylikFaizOrani));
            break;

        case 3 :// cekim yapip bakiyemizin kalan degerini donduruyor 3
           System.out.println("Cekim yapacaginiz tutari giriniz: ");
           tutar=input.nextDouble();
           System.out.println("Kalan bakiyeniz: "+hesapp.paraCekme(tutar));
            break;
            
        case 4 :// yatirdigimiz tutar sonucu bakiyemizi gosteriyor 4
           System.out.println("Yatiracaginiz tutari giriniz: ");
           tutar=input.nextDouble();
           System.out.println("Toplam bakiyeniz: "+hesapp.paraYatir(tutar));
            break;

        case 5 :// id acilma tarihi ve bakiyenin son durumunu gosteriyor
           hesapp.yazdir();
            break;

        default :// aralik disinda ise uyari veriyor
            System.out.println("Lutfen aralik icinde rakam girisi yapiniz");
            break;
        }
        }
        
    }
    
}
