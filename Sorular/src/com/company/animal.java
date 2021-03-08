package com.company;

public abstract class animal {
    private int legs;   //hayvanlarin bacak bilgisi burada tutuluyor
    private String tur; //hayvanlarin turu burada tutuluyor
    //overloading
    public animal(int legs,String tur) {
        this.legs = legs;//alt sinifdan super ile gelen bacak ve tur bilgisi legs degiskenine tanimlaniyor
        this.tur=tur;
    }
    public animal(int legs){
        this.legs=legs;//alt siniftan gelen bacak sayisi bilgisi legs degiskenine tanimlaniyor
    }


    abstract void hareket();
    abstract void davranis();//override edilmesi zorunlu methodlar
    abstract void AirBreathing();
    //get set
    public int getLegs() {
        return legs;//bacak bilgisini geri donduruyor
    }

    public void setLegs(int legs) {
        this.legs = legs;//bacak bilgisini ayarliyor
    }

    public String getTur() {
        return tur;//tur bilgisini gerı donduruyor
    }

    public void setTur(String tur) {
        this.tur = tur;//tur bilgisini ayarliyor
    }
}
