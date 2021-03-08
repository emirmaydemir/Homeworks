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
        boolean deger=false;
        String marka;
        int id;
        int hiz=0;
        int speed;
        int ses=0;
        int kanal=0;
        int muzikSayisi=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Mp3 acmak icin A basiniz");
        String tut=input.next();
        if(tut.charAt(0)=='A'){
            deger=true;
        }
        System.out.println("Mp3 içindeki muzik sayisini gir"); 
        muzikSayisi=input.nextInt();
        Mp3 mp3=new Mp3(deger,muzikSayisi);
        System.out.println("Mp3 markasini giriniz");
        marka=input.next();
        System.out.println("Mp3 id giriniz (sayi girisi yapiniz)");
        id=input.nextInt();
        Mp3_test mp3_test=new Mp3_test(id,marka);
        mp3_test.marka();
        mp3_test.id();
        
        
        
        while(deger==true){//m3'u kapatmadigimiz surece islem yapmamizi saglicak
        System.out.println("Mp3 Oynatma hizini giriniz 0-4 aralıgında");
        speed=input.nextInt();
        mp3_test.hiz(speed);// hiz degerini sinifimiza gonderdik
        System.out.println("kanal arttirmak icin U azanltmak icin D basin bir sey yapmak istemiyorsaniz herhangi bir harfi tuslayin");
        tut=input.next();
        if(tut.charAt(0)=='U'){
            kanal=mp3.kanalArt();// sinifimizdaki fonksiyon ile bir sonraki muzige gectik
        }
        if(tut.charAt(0)=='D'){
            kanal=mp3.kanalAzal();// sinifimizdaki fonk ile bir onceki muzige geldik
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
            deger=false;//muzik calari kapattik
        }
        }
        
    }
    
}
