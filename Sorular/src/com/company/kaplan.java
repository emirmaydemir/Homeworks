package com.company;

public class kaplan extends animal implements etcil{
    public kaplan(String tur) {
        super(4,tur);//super ile ust sinif constructorunu cagirdik ve bacak sayisini ve turu gonderdik
    }
    public kaplan(){
        super(4);//super ile ust sinif constructorunu cagirdik ve bacak sayisini gonderdik
    }

    @Override
    void hareket() {
        System.out.println("kaplan hareket etti");
        //animal sinifi abstract methodunu override ettik hareket ettiği bilgisini veriyor
    }

    @Override
    void davranis() {
        System.out.println("kaplan agresif davrandi");
        //animal sinifi abstract methodunu override ettik davranis bilgisi veriyor
    }

    @Override
    void AirBreathing() {
        System.out.println("kaplan hava aldi");//nefes aldiran abstract methodu override ettik
    }

    @Override
    public void et() {
        System.out.println("kaplan et yedi");//etcil hayvanlara
        // ozel interfaceyi override ettik bu method etcillerin et yedigini soyluyor
    }

    @Override
    public void kisabagirsak() {
        System.out.println("kaplan etcil oldugu icin kisa bagirsaklidir");//etcil hayvanlara ozel interfaceyi //
        // override ettik bu method etcil hayvanlarin kisa bagirsak oldugunu soyluyor
    }
}
