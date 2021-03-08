package testt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author risin
 */
public class Idari extends Personel {
    public Idari(){
        
    }

    public Idari(String ofis, double maas,String birim) {
        super(ofis, maas, birim);
    }
    @Override
    public String toString(){
        return "Sinif ismi: Idari "+"Ismi: "+super.ad;
    }
     
}
