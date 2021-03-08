package com.company;

public class denizayisi extends animal implements otcul{
    public denizayisi(String tur) {
        super(4,tur);
    }//super ile ust sinif constructorunu cagirdik ve bacak sayisini ve turu gonderdik

    public denizayisi(){
        super(4);//super ile ust sinif constructorunu cagirdik ve bacak sayisini gonderdik
    }

    @Override
    void hareket() {
        System.out.println("deniz ayisi hareket etti");//animal sinifi abstract methodunu override ettik
        //hareket ettiği bilgisini veriyor
    }

    @Override
    void davranis() {
        System.out.println("deniz ayisi sakin davrandi");//animal sinifi abstract methodunu override ettik davranis
    }

    @Override
    void AirBreathing() {
        System.out.println("deniz ayisi nefes aldi");//nefes aldiran abstract methodu override ettik
    }

    @Override
    public void ot() {
        System.out.println("deniz ayisi ot yedi");
        //otcul hayvanlara
        // ozel interfaceyi override ettik bu method otcullarin ot yedigini soyluyor
    }

    @Override
    public void uzunbagirsak() {
        System.out.println("deniz ayisi otcul oldugu icin uzun bagirsaklidir");
    }
    //otcul hayvanlara ozel interfaceyi //
    // override ettik bu method otcul hayvanlarin uzun bagirsak oldugunu soyluyor
}
