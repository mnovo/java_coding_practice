/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackcode;

import java.util.Arrays;

/**
 *
 * @author michael
 */
public class Node {
    
    public int value;
    public Node left;
    public Node right;
    
    public Node (int value)
    {
     this.value = value;
     left = null;
     right = null;
    }    
    
    public Node createBST (int[] arr, int begin, int end)
    {
        int mid = (begin + end) / 2;
        
        System.out.println("---------------------------------" ) ;
        System.out.println("end is: " + end + " begin is: " + begin) ;
        System.out.println("mid is: " + mid ) ;
                
        if (end < begin)
        {
            return null;
        }

        System.out.println("Arr[mid] = " + arr[mid]) ;
        
        System.out.println("---------------------------------" ) ;
        
        Node n = new Node(arr[mid]);        
        n.left = createBST(arr, begin, mid-1) ;
        n.right = createBST(arr, mid+1, end) ;                 
        return n;
    }
    
    
    
}
