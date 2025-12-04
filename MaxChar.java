import java.util.*;

public class MaxChar {
    public static void main(String[] args) {
        String s = "success";

        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        char maxChar=' ';
        int max=0;

        for(var e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                maxChar = e.getKey();
            }
        }

        System.out.println(maxChar);
    }
}
