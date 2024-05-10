import java.util.HashMap;
import java.util.Map;


public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s="aabbcd";
        //Approach 1
        // for(int i=0;i<s.length();i++){
        //     boolean flag=false;
        //     for(int j=0;j<s.length();j++){
        //         if(i != j && s.charAt(i)==s.charAt(j)){
        //             flag=true;
        //             break;
        //         }
        //     }
        //     if(!flag){
        //         System.out.println(s.charAt(i));
        //         break;
        //     }
        // }
        // Approach 2
      Map<Character,Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }else{
            map.put(ch, 1);
        }
     }
    for(Map.Entry<Character,Integer> entry: map.entrySet()){
        if(entry.getValue()==1){
            System.out.println(entry.getKey());
            break;
        }
    }
     

    }
}
