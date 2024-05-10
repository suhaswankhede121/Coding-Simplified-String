import java.util.Arrays;

class LongestCommonPrefix{
    public static void main(String[] args) {
        String str[]={"acb","acd","acbb","ac"};
       System.out.println(longest(str));
    }

    static String longest(String []str){
        Arrays.sort(str);
        char first[]=str[0].toCharArray();
        char last[]=str[str.length-1].toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
             sb.append(first[i]);
        }
        return sb.toString();
    }
}