/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackcode;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author michael
 */
public class uniqueIntArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = new int [101];
        int bound = 102;
        Random rand = new Random();
        int r = rand.nextInt(bound);
        arr[0] = r;
        System.out.println(r + " " + 0);
        
        boolean contains = false;
        
        for (int i = 1 ; i < arr.length ; i++)
        {
            do 
            {
                contains = false;
                r = rand.nextInt(bound) ;
                //System.out.println("New random = " + r); 
                for (int j = 0; j < arr.length ; j++)
                {
                    if (arr[j] == r)
                    {
                      contains = true;                    
                    }
                }                        
            } while (contains);
            
            arr[i] = r;       
            System.out.println(r + " " + i);
        }
        
        Arrays.sort(arr);
    }
    
}
