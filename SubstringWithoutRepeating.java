import java.util.*;
public class SubstringWithoutRepeating {
    public static void main(String[] args) {
        String s="abcabcbb";
        Map<Character,Integer> map=new LinkedHashMap<>();
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
          char ch=arr[i];
          if(!map.containsKey(ch)){
              map.put(ch, i);
          }else{
            i=map.get(ch);
            map.clear();;
          }
        }
        int maxCount=0;
        String ls=null;
        if(map.size()>maxCount){
            maxCount=map.size();
            ls=map.entrySet().toString();
        }
        System.out.println(ls+" is substring with length  "+maxCount);
    }
}
