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
public class Ogrenci extends Kisi {
   

    Ogrenci() {
     
    }
   @Override
    public String toString(){
        return "Sinif ismi: Ogrenci "+"Ismi: "+super.ad;
    }
    public Ogrenci(String adO,String adresO,String epostaO,String telefonNoO){
        super(adO,adresO,epostaO,telefonNoO);
    }
}
