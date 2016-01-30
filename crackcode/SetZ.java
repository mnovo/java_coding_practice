/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackcode;

import java.util.Random;

/**
 *
 * @author michael
 */
public class SetZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random r = new Random();
        
        int rows = 5;
        int cols = 6;
        
        int [][] arr = new int [rows][cols];
        
        for (int i = 0 ; i < rows; i ++)
        {
            for (int j = 0 ; j < cols; j++)
            {
                //arr[i][j] = r.nextInt(2);
                arr[i][j] = 1;
            }
        }
        
        arr[0][0] = 0;
        arr[rows-1][cols-1] = 0;
        
        
        print2dArr(arr, rows, cols);
        
        System.out.println();
        
        int [][] zeroArr = setZeroes(arr, rows, cols);
        
        print2dArr(zeroArr, rows, cols);
        
    }
    
    public static int[][] setZeroes(int[][] arr, int rows, int cols)
    {
        int [] rowArr = new int[rows];
        int [] colArr = new int[cols];
        
        for (int i = 0; i < rows ; i++)
            rowArr[i] = -1;
        
        for (int i = 0; i < cols ; i++)
            colArr[i] = -1;
        
        // Scan 2d array to find zeroes
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] == 0)
                {
                    rowArr[i] = 0;
                    colArr[j] = 0;
                }
            }
        }
        
        for (int i = 0 ; i < rows; i++)
        {
            if (rowArr[i] == 0)
            {
                for (int j = 0 ; j < cols; j++)
                {
                    arr[i][j] = 0;
                }
            }
        }
        
        for (int i = 0 ; i < cols; i++)
        {
            if (colArr[i] == 0)
            {
                for (int j = 0 ; j < rows; j++)
                {
                    arr[j][i] = 0;
                }
            }
        }
        
        return arr;
    }
    
    
    public static void print2dArr (int [][] arr, int rows, int cols)
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
    }
}
