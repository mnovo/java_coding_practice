/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Gen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static <AnyType extends Comparable<? super AnyType>> 
        AnyType findMax( AnyType [ ] arr)
    {
        int maxIndex = 0;
        
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(arr[maxIndex]) > 0 )
                maxIndex = i;
        
        return arr[maxIndex];        
    }            
    
}
