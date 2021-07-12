public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }
        int mod=0,temp=0;
        temp=x;
        while(x!=0){
            int k = x%10;
            mod=mod*10+k;
            x/=10;
        }

        if(mod != temp){
            return false;
        }
        return true;
    }
}
