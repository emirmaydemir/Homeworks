package soru_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author risin
 */
public class Mp3 extends miras{
    private String song;
    private String singer;
    private double time;
    private boolean ac_kapa=false;
    public Mp3(){
    }
    public Mp3(boolean deger){// acma kapama degerini  ve muzik sayisini ilk olarak burda aldik
       this.ac_kapa=turnOn(deger);// alinan degeri fonka gonderip acma kapama islemini gerceklestirdik
       
    }
    public Mp3(String song,String singer,double time){
        this.song=song;
        this.singer=singer;//muzik bilgilerini aldik 3 nesnenin
        this.time=time;
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
     
     public String getSong(){
         return this.song;
     }
     public void setSong(String song){
         this.song=song;
     }
     public String getSinger(){
         return this.singer;
     }
     public void setSinger(String singer){
         this.singer=singer;
     }
     public double getTime(){
         return this.time;
     }
     public void setSong(double time){
         this.time=time;
     }
}
