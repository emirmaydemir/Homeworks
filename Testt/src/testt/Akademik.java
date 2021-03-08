/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

/**
 *
 * @author risin
 */
public class Akademik extends Personel {
    @Override
    public String toString(){
        return "Sinif ismi: Akademik "+"Ismi: "+super.ad;
    }
    public Akademik(String ofis,double maas,int ofisSaat,String unvan){
        super(ofis,maas,ofisSaat,unvan);
    }
}
