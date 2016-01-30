/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackcode;

import com.sun.corba.se.impl.orbutil.graph.Graph;

/**
 *
 * @author michael
 */
public class CrackCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int size = 10;
    int[] myArray = new int[size]; 
   
    for (int l : myArray)
    {
        myArray[l] = 9;
    }
    
    for (int j : myArray)
    {
        System.out.println(j);
    }
    
    
    
    }
    
}
