/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplar;

import java.util.Date;

/**
 *
 * @author risin
 */
public class hesap {
    private int id;
    private double bakiye=0;
    private double faizOraniYillik=4.5;
    private Date  hesapAcilmaTarihi=new Date();
    
    public hesap(){// random hesap olusturan cons
        int id2;
        double bakiye2;
        id2=(int) (Math.random() * 500000);// 0-500000 arasi rastgele id
        bakiye2=(Math.random() * 100000);// 0-100000 arasi rastgele bakiye
        this.id=id2;// rastgele id2'yi id degiskenimize atiyoruz her yerde kullanmak icin
        this.bakiye=bakiye2;// rastgele bakiye2'yi bakiye degiskenimize atiyoruz her yerde kullanmak icin
    }
    
    public hesap(int id,double bakiye){// bizim hesap olusturmamizi saglayan cons
        this.id=id;// mainde aldigimiz id degerini siniftaki id degerine esitliyoruz
        this.bakiye=bakiye;// mainde aldigimiz bakiye degerini siniftaki bakiye degerine esitliyoruz
    }
    
    public double getAylikFaizOrani (){// aylik faiz oranini dondurur
       double faizOraniAylik=faizOraniYillik/12;
       return faizOraniAylik;
    }
    
    public double  getAylikFaiz (double aylikFaizOrani){//aylik faizi döndurur
      double aylikFaiz=this.bakiye*aylikFaizOrani;
      return aylikFaiz;
    }
    
    public double  paraCekme(double tutar){// parayi cekip yeni bakiyeyi gosterir
       if(tutar<=0){//- deger girisini engeller
       System.out.println("Lutfen gecerli deger giriniz!!!"); 
       }
       else if(tutar<=this.bakiye){
       this.bakiye=this.bakiye-tutar;
       }
       else{// bakiyemizden fazla para cekmeyi engeller
       System.out.println("Yeterli bakiyeniz yoktur...");
       }
       return this.bakiye;
    }
    
    public double paraYatir(double tutar){
        if(tutar>0){
        this.bakiye=this.bakiye+tutar;
        }
        else{//- deger girisini engeller
        System.out.println("Lütfen geçerli bir değer giriniz...");  
        }
        return this.bakiye;
        
    }
    public void yazdir(){// id hesaptarih ve bakiye yazdirir
        System.out.println("ID'niz: "+this.id+" Hesap acilis tarihiniz: "+this.hesapAcilmaTarihi+" Bakiyeniz: "+this.bakiye);
    }

}
