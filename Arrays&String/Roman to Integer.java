import java.io.*;
import java.util.*;
class Solution {
    public int romanToInt(String str) {
        int res=0;
         HashMap <Character,Integer> map=new HashMap<Character,Integer>();
        
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
        
        
        for(int i=0;i<str.length();i++)
        {
            if(i<str.length()-1&&(map.get(str.charAt(i))<map.get(str.charAt(i+1))))
                res=res-map.get(str.charAt(i));

            else
                res=res+map.get(str.charAt(i));
            
        }
        return res;
        
    }
}