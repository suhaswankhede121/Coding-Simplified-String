public class ReverseWord {
    public static void main(String[] args) {
        String s="suhas Wankhede";
        String []str=s.split("\\s");
        String s1="",s2="";
        s1=str[0];
        s2=str[1];
        StringBuilder sb=new StringBuilder(s1);
        StringBuilder sb2=new StringBuilder(s2);
        String ans="";
        ans+=sb.reverse();
        ans+=" ";
        ans+=sb2.reverse();
        System.out.println(ans);
        

    }
}
