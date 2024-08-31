import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringTokenizer str=new StringTokenizer(s," ");
        StringBuffer buff=new StringBuffer("");
        while(str.hasMoreTokens()){
           buff.insert(0,str.nextToken());
           buff.insert(0," ");
        }
        return buff.toString().trim();
    }
}


