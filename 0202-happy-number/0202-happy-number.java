class Solution {
    public boolean isHappy(int n) {
      int res=0;
      if(n==1 || n==7){
        return true;
      }else if(n<=9){
        return false;
      }else{
        while(n!=0){
        int re=n%10;
        res=res+(re*re);
        n/=10;
      }
     return isHappy(res);
    }
    }
}