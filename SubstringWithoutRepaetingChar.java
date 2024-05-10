
import java.util.*;
public class SubstringWithoutRepaetingChar {
    public static void main(String[] args) {
        String s="abcabcbbb";
        Set<Character> set=new HashSet<>();
        int max=0;
        int left=0,right=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            if(set.add(ch)){
                max=Math.max(max, right-left+1);
                right++;
            }else{
                while(s.charAt(left)!=ch){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(ch);
                left++;
            }
        }
        System.out.println(" Set is "+set+ " length is "+max);
    }
}

