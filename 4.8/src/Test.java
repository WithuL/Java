class Example{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        String str1 = "haaa";
        String str2 = "haha";
        System.out.println(compare(str1,str2));
    }
    public void change(String str,char ch[ ]){
        str = "test ok";
        ch[0] = 'g';
    }
    public static int compare (String str1,String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        int len = Math.min(c1.length,c2.length);
        int i = 0;
        for(; i < len ; i++) {
            if(c1[i] != c2[i]) {
                return c1[i] - c2[i];
            }
        }
        return c1[i]-c2[i];
    }
}

public class Test{

}