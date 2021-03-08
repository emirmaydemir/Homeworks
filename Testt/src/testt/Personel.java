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
public class Personel extends Kisi {
    Personel() {
    }
    
    @Override
    public String toString(){// override
        return "Sinif ismi: Personel "+"Ismi: "+super.ad;
    }
    public Personel(String ofis,double maas,String birim){
        super(ofis,maas,birim);                       
    }
    public Personel(String ofis,double maas,int ofisSaat,String unvan){
       super(ofis,maas,ofisSaat,unvan);
    }
}
