public class ReverseInteger {
    public static void main(String [] args) {
        int x = 1534236469;  // leetcode
//        int x = 123456789; // sequence of numbers
//        int x = 65432987; // none repeated numbers
//        int x = 54456778;// repeated numbers in integer
        int reversed = 0;

        //run loop until x becomes 0
        while(x!=0){

            //get last digit from x
            int digit = x % 10;
            reversed = reversed *10 + digit;

            //remove the last digit from x
            x /= 10;
        }

        /*
        for loop solution
        for(; x!=0; x /=10{
            int digit = x % 10;
             reversed = reversed *10 + digit;

        }
         */
        System.out.println(reversed);
    }
}
//this test fails in leetcode. Tried and tested with different inputs, all pass except leetcode input
