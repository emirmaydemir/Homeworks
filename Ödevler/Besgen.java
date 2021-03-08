/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package besgen;

import java.util.Scanner;

/**
 *
 * @author risin
 */
public class Besgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yaricap,alan,sonuc;
        System.out.println("Lutfen yaricap giriniz");
        yaricap=input.nextDouble();
        double radyan = Math.toRadians(72);
        double sin=Math.sin(radyan);
        yaricap=Math.pow(yaricap,2);
        sonuc=(5.0/2.0)*(yaricap)*(sin);
        System.out.println("Besgenin alani: "+sonuc);
        
        
        
    }
    
}
