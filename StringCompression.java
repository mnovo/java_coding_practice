/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class StringCompression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static String StriCompress(String origStr)
    {
        if (!(origStr.length() > 0))
            return origStr;
              
        String newStr = origStr.substring(0, 1);
        int strInd = 1;
                
//        for (int i = 1; i < origArr.length; i++)
//        {
//            if (origArr[i] == origArr[i-1])
//            {
//                newArr[strInd] = newArr[strInd] + 1;
//            }
//            else
//            {
//                if (strInd >= origArr.length - 3) return origStr;
//                strInd++;
//                newArr[strInd] = origArr[i];
//                strInd++;
//                newArr[strInd] = 1;                        
//            }
//            
//        }        
        
        return "";
    }
    
}
