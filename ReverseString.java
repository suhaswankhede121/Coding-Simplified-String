import java.util.Stack;

class ReverseString{
    public static void main(String[] args) {
        String s="suhas";
        String a="";
        //first way
        // for(int i=s.length()-1;i>=0;i--){
        //     char ch=s.charAt(i);
        //     a+=ch;

        // }
        // System.out.println(a);

        //second way
        // StringBuilder sb=new StringBuilder(s);
        // System.out.println(sb.reverse());

        // third way using stack

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            st.push(ch);
        }
        while(st.size()>0){
             a+=st.pop();
        }
        System.out.println(a);
    }
}