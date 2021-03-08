/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monte.carlo;

/**
 *
 * @author risin
 */
public class MonteCarlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //  alani 4 olan kare iciresindeki yaricapi=1 olan daire icerisine noktalarin denk gelme olasiligi (pi*r^2)/(2r)^2 burdanda sonuc pi/4 ve bunu 4 ile carpip pi nin yaklasik degerini bulacaz
    int toplamNokta = 0;// kare icinde olan noktalar
    int daireIci = 0;// daire icinde olan noktalar
    double xKoordinati;
    double yKoordinati;
    int i=0;

     while (i<=500000){ // rastgele noktalar koyuyuroz karenin icine
     xKoordinati= Math.random();// rastgele x koordinati
     yKoordinati = Math.random();// rastgele y koordinati
      if ((Math.pow(xKoordinati, 2) + Math.pow(yKoordinati, 2)) < 1) {
      daireIci=daireIci+1;// eger nokta daire icindeyse bunuda sayiyoruz
      }
      i=i+1;
      toplamNokta =toplamNokta+1 ;// atilan her nokta sayiliyor
    }
    double pi = 4*(daireIci*1.0/toplamNokta*1.0);// formulumuzde pi/4'u 4 ile carparak yaklasık degeri buluyorduk buradada ayni islemi yaptik
    System.out.println("Pi sayisini degeri yaklasik olarak= " + pi);
    }
    
}
