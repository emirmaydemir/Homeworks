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
public class Mp3_test {
    String marka;
    int id;
    
    
    public Mp3_test(){
    }
    public Mp3_test(int id,String marka){
        this.id=id;// alinan id yi sinif icerisindeki id ye esitledik
        this.marka=marka; // alinan  markayi sinif icerisindeki id ye esitledik    
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
}

