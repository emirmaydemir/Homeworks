/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dunya;

import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Dunya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println(Math.asin(1));
        //System.out.println(Math.sin(1.5707963267948966));
        double enlem1,enlem2,boylam1,boylam2,r,uzunluk;
        r=6.37101;
        Scanner input=new Scanner (System.in);
        System.out.println("1. noktanin enlemini derece olarak giriniz");
        enlem1=input.nextDouble();
        enlem1=Math.toRadians(enlem1);
        System.out.println("1. noktanin boylamini derece olarak giriniz");
        boylam1=input.nextDouble();
        boylam1=Math.toRadians(boylam1);
        System.out.println("2. noktanin enlemini derece olarak giriniz");
        enlem2=input.nextDouble();
        enlem2=Math.toRadians(enlem2);
        System.out.println("2. noktanin boylamini derece olarak giriniz");
        boylam2=input.nextDouble();
        boylam2=Math.toRadians(boylam2);
        uzunluk=r*(Math.acos(Math.sin(enlem2)*Math.sin(enlem1)+Math.cos(enlem2)*Math.cos(enlem1)*Math.cos(boylam2-boylam1)));
        System.out.println("2 nokta arasi uzaklik: "+ uzunluk*1000+"km");
        
        
        
        
    }
    
}
