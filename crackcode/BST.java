/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackcode;

import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author michael
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
        // Given an array of unique sorted integers, create a BST of 
        // minimal height
        
        
        int[] arr = new int[7];
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
        }
                
        Node bst = new Node(-1);
        Node n = bst.createBST(arr, 0, arr.length - 1);
        
        System.out.println("             " +    n.value);
        System.out.println( "       "  +  n.left.value + "         " + n.right.value);
        System.out.println("   " + n.left.left.value + "      " + n.left.right.value + "   " + n.right.left.value + "     " + n.right.right.value);
        
        
                               
          
    }   
    
    
}
