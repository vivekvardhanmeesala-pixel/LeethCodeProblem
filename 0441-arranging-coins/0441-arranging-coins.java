class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int i=1;
        int count=0;
        while(i<=n){
           n=n-i;
           count++;
           i++;
        }
        return count;
    }
}