class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        String ss=s.toLowerCase();
        while(i<j){
            char ch1=ss.charAt(i);
            char ch2=ss.charAt(j);
            if(!Character.isLetter(ch1)&&!Character.isDigit(ch1)){
               i++;
               continue;
            }
            if(!Character.isLetter(ch2)&&!Character.isDigit(ch2)){
               j--;
               continue;
            }
            if(ch1!=ch2){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}