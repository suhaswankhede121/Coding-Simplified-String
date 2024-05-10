
class RemoveDublicateCharacter {
    public static void main(String[] args) {
        String s = "suhas";
        StringBuilder sb=new StringBuilder();
        char ans[]=s.toCharArray();
        for(int i=0;i<ans.length;i++){
             boolean flag=false;
            for(int j=i+1;j<ans.length;j++){
                if(ans[i]==ans[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                sb.append(ans[i]);
            }
        }

        System.out.println(sb);
    }
}
