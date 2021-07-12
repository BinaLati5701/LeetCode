import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int number = 0;
        int currentValue;
        int nextPosition;

        for (int i=0; i < s.length(); i++){
            currentValue = map.get(s.charAt(i));
            nextPosition = (i + 1);
            if (nextPosition < s.length() && currentValue < map.get(s.charAt(nextPosition))){
                number += (map.get(s.charAt(nextPosition)) - currentValue);
                i++;
            }else{
                number += currentValue;
            }
        }
        return number;

    }
    public static void main(String[]args){
        String s =  "LVIII";
        System.out.println(romanToInt(s));
    }
}
