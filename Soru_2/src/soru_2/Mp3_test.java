package soru_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author risin
 */
public class Mp3_test extends miras {
    private String marka;
    private int muzikSayisi;
    private int id;
    private ArrayList<Mp3>songs=new ArrayList<>();
    
    
    public Mp3_test(){
    }
    public Mp3_test(int id,String marka,int muziksayisi){
        this.id=id;// alinan id yi sinif icerisindeki id ye esitledik
        this.marka=marka; // alinan  markayi sinif icerisindeki id ye esitledik 
        this.muzikSayisi=muziksayisi;
    }
    public void add(Mp3 a){
        songs.add(a);
    }
    public void yaz(){
        System.out.println("MUZIKLER: ");
        for(int i=0;i<songs.size();i++){
            System.out.println("Sarkici ismi: "+songs.get(i).getSong()+"--- Muzik: "+songs.get(i).getSinger()+"--- Suresi: "+songs.get(i).getTime());
        }
    }
    public void marka(){
        System.out.println("Mp3 markası= "+this.marka);
    }
    public void id(){
       System.out.println("Mp3 id= "+this.id);
    }
    public void hiz(int hiz){
        if(hiz<=4 && hiz>=0){// secilen hizin 0 ile 4 arasinda secilmesini sagladik
            System.out.println("Oynatma hizi: "+hiz);
        } 
        else{
    System.out.println("Lütfen hiz aralaginda giriniz");
}
}
    public int getMuziksayisi(){
        return this.muzikSayisi;
    }
    public void setMuziksayisi(int muzikSayisi){
        this.muzikSayisi=muzikSayisi;
    }
}