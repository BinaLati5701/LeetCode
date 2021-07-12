public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for( int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }

        }
        return prefix;

    }
    public static void main(String[]args){
        String []strs = {"flower","flow","flight"};
        String [] strs1 = {"dog", "racecar", "car"};
        String [] strs2 = {"dog", "doctor", "dorm"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }
}
