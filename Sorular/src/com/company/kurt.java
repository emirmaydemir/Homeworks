package com.company;

public class kurt extends animal implements etcil{
    public kurt(String tur) {
        super(4,tur);//super ile ust sinif constructorunu cagirdik ve bacak sayisini ve turu gonderdik
    }
    public kurt(){
        super(4);//super ile ust sinif constructorunu cagirdik ve bacak sayisini gonderdik
    }

    @Override
    void hareket() {
        System.out.println("kurt hareket etti");//animal sinifi abstract methodunu override ettik
    }

    @Override
    void davranis() {
        System.out.println("kurt acikti ava cikti");//animal sinifi abstract methodunu override ettik
    }

    @Override
    void AirBreathing() {
        System.out.println("kurt nefes aldi");//animal sinifi abstract methodunu override ettik nefed aldiriyor
    }

    @Override
    public void et() {
        System.out.println("kurt et yedi");//etcil hayvanlara
        // ozel interfaceyi override ettik bu method etcillerin et yedigini soyluyor
    }

    @Override
    public void kisabagirsak() {
        System.out.println("kurt etcil oldugu icin kisa bagirsaklidir");//etcil hayvanlara ozel interfaceyi //
        // override ettik bu method etcil hayvanlarin kisa bagirsak oldugunu soyluyor
    }
}
