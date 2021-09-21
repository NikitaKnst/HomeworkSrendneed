/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Home
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         int sum = 0;
     int [] arr = new int[20];
      Random randNum = new Random();
      for (int i = 0; i < 20; i++) {
         arr[i] = randNum.nextInt(20/2)*2;
           sum += arr[i];
      }
      System.out.println("Random numbers = "+Arrays.toString(arr));
      for (int i=0; i<1; i++){
          int max = Arrays.stream(arr).max().orElse(0);
          int min = Arrays.stream(arr).min().orElse(0);
        
         int masivrasmer=arr.length;
         int MidleSumma=sum-max-min;
         System.out.println("Lenght Massiv:"+masivrasmer);        
         System.out.println("All summa:"+sum);
         System.out.println("Max:"+max);
         System.out.println("Min:"+min);
         System.out.println("Midle Max:"+MidleSumma);
         System.out.println("Average of an array:"+MidleSumma/masivrasmer);
      }
        
   }
}
    
    

