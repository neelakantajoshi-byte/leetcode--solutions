class Solution {
    public int reverse(int x) {int r=0;
        while(x!=0){
            int q=x%10;
            if(r>Integer.MAX_VALUE/10|| (r==Integer.MAX_VALUE/10 && q>7)){
                return 0;
            }
            if(r<Integer.MIN_VALUE/10|| (r==Integer.MIN_VALUE/10 && q<-8)){
                return 0;
            }
            x=x/10;
            r=(r*10)+q;
        }
        return r;
        
    }
}