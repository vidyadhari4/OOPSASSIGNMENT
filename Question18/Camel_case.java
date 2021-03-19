class Camel_case{
    public static void main(String args[]){
        String s="Hello, My name is Janice!";
        char s1[]=s.toCharArray();
        int l=s.length();
        int i;
        s1[0]=(char)(s1[0]+'a'-'A');
        i=1;
        while(i!=l-1){
            if(Character.isWhitespace(s1[i])){
                if(s1[i+1]>='a' && s1[i+1]<='z'){
                    s1[i+1]=(char)(s1[i+1]-'a'+'A');
                }
                i=i+2;
            }
            else{
                i=i+1;
            }
        }
        System.out.print(s1);
    }
}