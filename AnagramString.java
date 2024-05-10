

public class AnagramString {
    public static void main(String[] args) {
        String s1="abb";
        String s2="bac";
       System.out.println(checkAnagram(s1, s2));
    }

    static boolean checkAnagram(String s1,String s2){
          char freq[]=new char[256];
          for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
          }
          for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
          }
         
            return true;
    }
}
