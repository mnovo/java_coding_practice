/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackcode;

/**
 *
 * @author michael
 */
public class StringPermute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String hi = "eMik";
        String me = "Mike";
        
        boolean val = permutation(hi, me);
        if (val)
            System.out.println("They are permutations");
        else
            System.out.println("They are not permutations");
    }

    public static boolean permutation(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        
        int[] letters = new int[128];
        
        char[] s_array = s.toCharArray();
        
        for (char c : s_array)
        {
            letters[c]++;
            System.out.print(c + " ");
            System.out.println((int)c);
            
        }
        
        for (int i = 0 ; i < t.length(); i++)
        {
            int c = (int) t.charAt(i);
            if (--letters[c] < 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
