public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
       if(nums.length==0) return  0;
       int i =0; int j =1;
       while(j < nums.length){
           if(nums[j] != nums[i]){
               i++;
               nums[i] = nums[j];

           }
           j++;

       }
       return  i+1;


    }
    public static void main(String[] args){
        int [] nums = {1,1,2,2};
        System.out.println(removeDuplicates(nums));

    }
}
