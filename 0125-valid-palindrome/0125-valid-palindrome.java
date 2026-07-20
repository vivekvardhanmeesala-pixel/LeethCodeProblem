class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char c=s.charAt(i);
            char c1=s.charAt(j);
            if(c==c1){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}