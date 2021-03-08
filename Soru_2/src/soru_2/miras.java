package soru_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author risin
 */
public class miras {
    private int muzik=0;
     private int ses=0;
     public int kanalArt(){
        this.muzik=this.muzik+1;// sinifimiz icindeki muzik degiskenini 1 arttirdik
        if(this.muzik<=3 && this.muzik>=0){// muzik sayisini - degerden ve mmuzik sayisindan kucuk olmasini engelledik
        return this.muzik;
        }
        else{
            this.muzik=this.muzik-1;
            System.out.println("Daha fazla muzik bulunmamaktadır");
            return this.muzik;//muzik degerini dondurduk
        }
    }
    public int kanalAzal(){
        this.muzik=this.muzik-1;// sinifimiz icindeki muzik degiskenini 1 azalttik
        if(this.muzik<=3 && this.muzik>=0){// muzik sayisini - degerden ve mmuzik sayisindan kucuk olmasini engelledik
        return this.muzik;//muzik degerini dondurduk
        }
        else{
            this.muzik=this.muzik+1;
            System.out.println("Daha asagisi yoktur");
            return this.muzik;
        }
    }
    public int sesArt(){
        this.ses=this.ses+1;// sinifimiz icindeki muzik degiskenini 1 arttirdik
        if(this.ses<=10 && this.ses>=0){// muzik sayisini - degerden ve mmuzik sayisindan kucuk olmasini engelledik
        return this.ses;
        }
        else{
            this.ses=this.ses-1;
            System.out.println("Daha fazla muzik bulunmamaktadır");
            return this.ses;//muzik degerini dondurduk
        }
    }
    public int sesAzal(){
        this.ses=this.ses-1;// sinifimiz icindeki muzik degiskenini 1 azalttik
        if(this.ses<=10 && this.ses>=0){// muzik sayisini - degerden ve mmuzik sayisindan kucuk olmasini engelledik
        return this.ses;//muzik degerini dondurduk
        }
        else{
            this.ses=this.ses+1;
            System.out.println("Daha asagisi yoktur");
            return this.ses;
        }
}
}
