public class ReverseIntegerWithLeetCodeInput {
    public static int reverse(int x) {
        long num=0;
        int n = x, digits=0;
        while(n!=0){
            digits++;
            n=n/10;
        }
        while(x!=0){
            int d = x%10;
            num+=d*Math.pow(10,digits-1);
            x=x/10;
            digits--;
        }
        System.out.println(num);
        if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE-1) return (int)num;
        return 0;

    }

    public static void main(String [] args){
        int num = 1534236469;
        System.out.println(reverse(num));
    }
}
