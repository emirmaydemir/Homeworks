package soru_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Soru_2 {

    /**
     * @param args the command line arguments
     */
// overloading constructor uzerinde yapilmistir Mp3 sinifinda
// miras alinan sinifta kanal ve ses artimi yapilmistir
//get ve set metodlari Mp3 sinifinda song singer ve time degiskenleri icin kullanilmistir
//nesne tutan arraylistimiz Mp3_test sınıfının içindedir
    public static void main(String[] args) {
        Mp3_test songs=new Mp3_test();//add methodunu kullanmak icin
        Mp3 m1=new Mp3("Jason Derulo","Take you dancing",3.10);
        Mp3 m2=new Mp3("Dua Lipa","Don't start now",3.03);//muzik calarda bulunan sarkilar
        Mp3 m3=new Mp3("Dj Khaled","Popstar",3.20);
 // get ve set methodları şarkıcı ismi, şarkı ismi ve sürede kullanılmıştır!!!!!!!!!!!!!!!!
        songs.add(m1);
        songs.add(m2);// arraylistte nesne gönderiyoruz
        songs.add(m3);
        
        songs.yaz();
        
        boolean deger=false;
        String marka;
        int id;
        int hiz=0;
        int speed;
        int ses=0;
        int kanal=0;
        int muzikSayisi=3;
        Scanner input=new Scanner(System.in);
        System.out.println("Mp3 acmak icin A basiniz");
        String tut=input.next();
        if(tut.charAt(0)=='A'){
            deger=true;
        }
        Mp3 mp3=new Mp3(deger);
        System.out.println("Mp3 markasini giriniz");
        marka=input.next();
        System.out.println("Mp3 id giriniz (sayi girisi yapiniz)");
        id=input.nextInt();
        Mp3_test mp3_test=new Mp3_test(id,marka,muzikSayisi);
        mp3_test.marka();
        mp3_test.id();
        
        
        
        while(deger==true){//m3'u kapatmadigimiz surece islem yapmamizi saglicak
        System.out.println("Mp3 Oynatma hizini giriniz 0-4 aralıgında");
        speed=input.nextInt();
        mp3_test.hiz(speed);// hiz degerini sinifimiza gonderdik
        System.out.println("kanal arttirmak icin U azanltmak icin D basin bir sey yapmak istemiyorsaniz herhangi bir harfi tuslayin");
        tut=input.next();
        if(tut.charAt(0)=='U'){
            kanal=mp3_test.kanalArt();// sinifimizdaki fonksiyon ile bir sonraki muzige gectik
        }
        if(tut.charAt(0)=='D'){
            kanal=mp3_test.kanalAzal();// sinifimizdaki fonk ile bir onceki muzige geldik
        }
        System.out.println("kanal: "+kanal);
        System.out.println("sesi arttirmak icin A azanltmak icin Z basin bir sey yapmak istemiyorsaniz herhangi bir harfi tuslayin");
        tut=input.next();
         if(tut.charAt(0)=='A'){
            ses=mp3.sesArt();// sinifimizdaki fonk ile sesi arttirdik
        }
        if(tut.charAt(0)=='Z'){
            ses=mp3.sesAzal();// sinifimizdaki fonk ile sesi azalttik
        }
        System.out.println("Ses: "+ses);
        System.out.println("Mp3 kapamak icin K basiniz devam etmek icin herhangi bir harfi tuslayin");
        tut=input.next();
        if(tut.charAt(0)=='K'){
            System.out.println("Muzik calar kapanmistir");
            deger=false;//muzik calari kapattik
        }
        }
    }
    
}
