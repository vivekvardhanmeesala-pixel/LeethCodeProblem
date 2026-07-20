class Solution {
    public int[] plusOne(int[] digits) {
       int c=0;
       for(int i=digits.length-1;i>=0;i--){
        if(digits[i]!=9){
            digits[i]=digits[i]+1;
            return digits;
        }
        else{
            digits[i]=0;
            c++;
        }
       }
       if(c==digits.length){
        int n=digits.length;
        int [] num=new int[n+1];
         for(int j=0;j<num.length;j++){
            if(j==0){
                num[j]=1;
            }
            else{
                num[j]=0;
            }
         }
         
         return num;
       }
       return digits;
    }
}