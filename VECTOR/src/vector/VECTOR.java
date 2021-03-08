/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author risin
 */
public class VECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Belirtilmediğinde, bir ArrayList boyutunun yarısı kadar artırılır.	
//Belirtilmediğinde, bir vektör boyutunu iki katına çıkarmak için artırılır.
//ArrayList senkronize edilmediğinden, Vector öğesinden daha hızlı çalışır.	
//Vector senkronize edildiğinde ArrayList'ten daha yavaş çalışır.
//ArrayList, ArrayList'te depolanan nesneleri dolaşmak için Iterator arabirimini kullanır.
//Vector, Vektörler'de depolanan nesneleri geçiş yapmak için Numaralandırma 
//ve Yineleyici arabirimini kullanır
      Vector v=new Vector(2,5);// sınırı aşarsa 5 boyut artar
      int temp=0;
      Random random=new Random();
      for(int i=0;i<10;i++){
          v.add(random.nextInt(10));
          System.out.println("Vektörün boyutu "+v.capacity());
      }
      for(int i=0;i<v.size();i++){
          System.out.print(i+1+". eleman: "+v.get(i));
          System.out.print("     ");
      }
         
                               
    }
    
}
