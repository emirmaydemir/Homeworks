package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        animal[] dizi={
          new kurt(),
          new denizayisi(),//polymorphism
          new kaplan()
        };
        kurt k=new kurt("etcil");
        denizayisi d=new denizayisi("otcul");//nesneleri olusturduk
        kaplan ka=new kaplan("etcil");
            //bilgileri ekrana bastirdik
        System.out.println("kurt bacak sayisi: "+dizi[0].getLegs()+" ve turu "+k.getTur());
        dizi[0].AirBreathing();
        dizi[0].davranis();
        dizi[0].hareket();
        k.et();
        k.kisabagirsak();
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("deniz ayisi bacak sayisi: "+dizi[1].getLegs()+" ve turu "+d.getTur());
        dizi[1].AirBreathing();
        dizi[1].davranis();
        dizi[1].hareket();
        d.ot();
        d.uzunbagirsak();
        System.out.println("/////////////////////////////////////////////////////////////");
        System.out.println("deniz ayisi bacak sayisi: "+dizi[2].getLegs()+" ve turu "+ka.getTur());
        dizi[2].AirBreathing();
        dizi[2].davranis();
        dizi[2].hareket();
        ka.et();
        ka.kisabagirsak();
    }
}
