public class ReplaceOccurance {
    // problem s="suhas" ot: 1uha2;
    public static void main(String[] args) {
        String s="suhass";
        String ans="";
        char ch='s';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(ch==s.charAt(i)){
                count++;
                ans+=count;
            }else{
                ans+=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
