class Solution {
    public boolean isPalindrome(int x) {
       if(x<0) return false;
       int rev=0;
       int x1=x;
        while(x1!=0){
             rev =(rev*10)+ (x1%10);
             x1=x1/10;
              }    
        return x==rev;
    }
}