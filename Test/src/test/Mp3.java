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
public class Mp3 {
    int ses=0;
    int muzik=0;
    int muzikSayisi;
    boolean ac_kapa=false;
    public Mp3(){
    }
    public Mp3(boolean deger,int muzikSayisi){// acma kapama degerini  ve muzik sayisini ilk olarak burda aldik
       this.ac_kapa=turnOn(deger);// alinan degeri fonka gonderip acma kapama islemini gerceklestirdik
       this.muzikSayisi=muzikSayisi;
    }
    public boolean turnOn(boolean deger){
        if(deger==true){
            System.out.println("Mp3 açılmıştır");
            return deger;
        }
        else{
            System.out.println("Mp3 kapanmıştır");
            return deger;
        }
   
}
    public int kanalArt(){
        this.muzik=this.muzik+1;// sinifimiz icindeki muzik degiskenini 1 arttirdik
        if(this.muzik<=muzikSayisi && this.muzik>=0){// muzik sayisini - degerden ve mmuzik sayisindan kucuk olmasini engelledik
        return this.muzik;
        }
        else{
            this.muzik=this.muzik-1;
            System.out.println("Daha fazla muzik bulunmamaktadır");
            return this.muzik;//muzik degerini dondurduk
        }
    }
    public int kanalAzal(){
        this.muzik=this.muzik-1;// sinifimiz icindeki muzik degiskenini 1 azalttik
        if(this.muzik<=muzikSayisi && this.muzik>=0){// muzik sayisini - degerden ve mmuzik sayisindan kucuk olmasini engelledik
        return this.muzik;//muzik degerini dondurduk
        }
        else{
            this.muzik=this.muzik+1;
            System.out.println("Daha asagisi yoktur");
            return this.muzik;
        }
    }
    public int sesArt(){
        this.ses=this.ses+1;// sinif icerisindeki ses degiskenini 1 arttirdik
        if(this.ses<=10 && this.ses>=0){//sesin - deger almasini ve gereken degeri asmasini engelledik
        return this.ses;
        }
        else{
            this.ses=this.ses-1;// sinif icerisindeki ses degiskenini 1 azalttik
            System.out.println("Daha yukarisi yoktur");
            return this.ses;
        }
    }
     public int sesAzal(){
        this.ses=this.ses-1;// sinif icerisindeki ses degiskenini 1 azalttik
        if(this.ses<=10 && this.ses>=0){//sesin - deger almasini ve gereken degeri asmasini engelledik
        return this.ses;
        }
        else{
            this.ses=this.ses+1;
            System.out.println("Daha asagisi yoktur");
            return this.ses;
        }
    }
    
}