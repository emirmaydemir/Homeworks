/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Testt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personel personel=new Personel();
        Idari idari=new Idari();//down casting
        personel=(Personel)idari;
 String adO="Emir";String adresO="Basak mah. 66.sok no:4";String epostaO="emir@gmail.com";String telefonNoO="0212 645 87 98";String adI="Emre";
 String adresI="Mevlana cad sok:34 no:45";String epostaI="emre@gmail.com";String telefonNoI="0212 264 45 12";String adP="Ahmet"; String adresP="Gozetepe sk:77 no:3";
 String epostaP="ahmet@gmail.com";String telefonNoP="0212 456 87 54";String ofisI="cynmoffice";
 double maasI=8000.0;String ofisP="BESToffice";double maasP=10000.0;String birim="Muhasebe";int ofisSaat=8;
 String unvan="Prof";
               
Kisi [] kisiler;
// polymorphism ve upcasting BURADA KULLANDIK
        kisiler = new Kisi[] {new Ogrenci(adO,adresO,epostaO,telefonNoO),new Idari(ofisI,maasI,birim),new Akademik(ofisP,maasP,ofisSaat,unvan)};
        kisiler[1].ad=adI;
        kisiler[1].adres=adresI;
        kisiler[1].eposta=epostaI;
        kisiler[1].telefonNo=telefonNoI;
        Idari idari2=new Idari();
        kisiler[2].ad=adP;
        kisiler[2].adres=adresP;
        kisiler[2].eposta=epostaP;
        kisiler[2].telefonNo=telefonNoP;
        
        
        
 System.out.println(kisiler[0].toString()+"// Adresi: "+kisiler[0].adres+"// Telefonu: "+kisiler[0].telefonNo+"// Eposta: "+kisiler[0].eposta+"// statusu: "+kisiler[0].statu);
 System.out.println(kisiler[1].toString()+"// Adresi: "+kisiler[1].adres+"// Telefonu: "+kisiler[1].telefonNo+"// Eposta: "+kisiler[1].eposta+"// ofisi: "+kisiler[1].ofis+"// maasi: "+kisiler[1].maas+"// ise baslama tarihi: "+kisiler[1].date()+"// Calistigi birim: "+kisiler[1].birim);
 System.out.println(kisiler[2].toString()+"// Adresi: "+kisiler[2].adres+"// Telefonu: "+kisiler[2].telefonNo+"// Eposta: "+kisiler[2].eposta+"// ofisi: "+kisiler[2].ofis+"// maasi: "+kisiler[2].maas+"// ise baslama tarihi: "+kisiler[2].date()+"// Ofis saati: "+kisiler[2].ofisSaat+"// Unvani "+kisiler[2].unvan);
        
        
        
        
        
        
    }
    
}
