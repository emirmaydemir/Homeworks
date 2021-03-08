/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cember;

/**
 *
 * @author risin
 */
public class Cember {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double random=Math.random()*361;
      
      random=Math.toRadians(random);
      double koseBirx,koseBiry,koseIkix,koseIkiy,koseUcx,koseUcy,sonuc1,sonuc2,sonuc3;
      double x1,y1,x2,y2,x3,y3;
      double aci1,aci2,aci3;
      int r=40;
      koseBirx=r*(Math.cos(random));
      koseBiry=r*(Math.sin(random));
      System.out.println("1. nokta Koordinatlari: "+(int)koseBirx+" "+(int)koseBiry);
      random=Math.random()*361;
      random=Math.toRadians(random);
      koseIkix=r*(Math.cos(random));
      koseIkiy=r*(Math.sin(random));
      System.out.println("2. nokta Koordinatlari: "+(int)koseIkix+" "+(int)koseIkiy);
      random=Math.random()*361;
      random=Math.toRadians(random);
      koseUcx=r*(Math.cos(random));
      koseUcy=r*(Math.sin(random));
      System.out.println("3. nokta Koordinatlari: "+(int)koseUcx+" "+(int)koseUcy);
      x1=Math.pow((koseBirx- koseIkix),2);
      y1=Math.pow((koseBiry- koseIkiy),2);
      x2=Math.pow((koseBirx- koseUcx),2);
      y2=Math.pow((koseBiry- koseUcy),2);
      x3=Math.pow((koseIkix- koseUcx),2);
      y3=Math.pow((koseIkiy- koseUcy),2);
      sonuc1=Math.sqrt(x1+y1);
      sonuc2=Math.sqrt(x2+y2);
      sonuc3=Math.sqrt(x3+y3);
      aci1=(Math.pow(sonuc2,2)+Math.pow(sonuc3,2)-Math.pow(sonuc1, 2))/(2*sonuc2*sonuc3);
      aci1=Math.acos(aci1);
      aci1=Math.toDegrees(aci1);
      System.out.println("1. aci "+aci1);
      aci2=(Math.pow(sonuc1,2)+Math.pow(sonuc3,2)-Math.pow(sonuc2, 2))/(2*sonuc1*sonuc3);
      aci2=Math.acos(aci2);
      aci2=Math.toDegrees(aci2);
      System.out.println("2. aci "+aci2);
      aci3=180-aci1-aci2;
      System.out.println("3. aci "+aci3);
      System.out.println("acilarin toplami: "+(aci1+aci2+aci3));
      
      
      
    }
    
}
