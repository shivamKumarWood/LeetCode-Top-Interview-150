class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        if(t.length()==0)
        return false;
        int count =0;
        int n=t.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(count)==(t.charAt(i)))
            ++count;
            if(count==s.length())
            return true;
        }
      
        return false;
        
    }
}