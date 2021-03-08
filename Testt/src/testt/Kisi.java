/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

import java.util.Date;

/**
 *
 * @author risin
 */
public class Kisi {
    final int statu=2;
    String ad;
    String adres;
    String eposta;
    String telefonNo;
    int ofisSaat;
    String unvan;
    String birim;
    String ofis;
    double maas;

    Kisi() {
    }
    @Override
    public String toString(){
        return "Sinif ismi: Kisi "+"Ismi: "+ad;
    }
    public Kisi(String adO,String adresO,String epostaO,String telefonNoO){   
        this.ad=adO;
        this.adres=adresO;
        this.eposta=epostaO;
        this.telefonNo=telefonNoO;
    }
    public Kisi(String ofis,double maas,int ofisSaat,String unvan){
        this.ofisSaat=ofisSaat;
        this.ofis=ofis;
        this.maas=maas;
        this.unvan=unvan;
        
    }
    public Kisi(String ofis,double maas,String birim){
        this.ofis=ofis;
        this.maas=maas;
        this.birim=birim;
    }
    public String date(){
        Date alim = new Date();
        return alim.toString();
        
    }
    
}
