class Solution {
    public String intToRoman(int x) {


    
    
        
        
        int n=0;
        String str="";
        
        
        if(x>4000)
        return null;
        if(x>=1000&&x<=3999)
        
            n=x/1000;
            for(int i=0;i<n;i++)
            str=str+"M";
            x=x%1000;
            if(x/100==9)
            str=str+"CM";
            else if(x>=500&&x<900)
            str=str+"D";
            else if(x/100==4)
            str=str+"CD";
            else{
                n=x/100;
                for(int i=0;i<n;i++)
                str=str+"C";
            }
         if(x/100>5&&x/100<9)
           {
               n=x/100-5;
               for(int i=0;i<n;i++)
                str=str+"C";
           }
            x=x%100;
            if(x/10==9)
            str=str+"XC";
            else if(x>=50&&x<100)
            str=str+"L";
            else if(x/10==4)
            str=str+"XL";
            else{
                n=x/10;
                for(int i=0;i<n;i++)
                str=str+"X";
            }
           if(x/10>5&&x/10<9)
           {
               n=x/10-5;
               for(int i=0;i<n;i++)
                str=str+"X";
           }
            x=x%10;
            if(x==9)
            str=str+"IX";
            else if(x>=5&&x<10)
            str=str+"V";
            else if(x==4)
            str=str+"IV";
            else if(x>0&&x<4)
            {
                n=x;
                for(int i=0;i<n;i++)
                str=str+"I";
            }
             if(x>5&&x<9)
            {
                n=x-5;
                for(int i=0;i<n;i++)
                str=str+"I";
            }         
        return str;      
    }
    
}
    