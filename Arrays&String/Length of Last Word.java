class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        boolean flag=false;
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                flag=true;
                cnt++;
            }else if(ch==' '&&flag==true){
                break;
            }
        }
        return cnt;
    }
}