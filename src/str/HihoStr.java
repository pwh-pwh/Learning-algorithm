package str;
   /*如果一个字符串恰好包含2个'h'、1个'i'和1个'o'，我们就称这个字符串是hiho字符串。
        例如"oihateher"、"hugeinputhugeoutput"都是hiho字符串。
        现在给定一个只包含小写字母的字符串S，小Hi想知道S的所有子串中，最短的hiho字符串是哪个。
        输入字符串S
        对于80%的数据，S的长度不超过1000
        对于100%的数据，S的长度不超过100000
        输出找到S的所有子串中，最短的hiho字符串是哪个，输出该子串的长度。如果S的子串中没有hiho字符串，输出-1。
        样例输入
        happyhahaiohell
        样例输出
        5*/
public class HihoStr {
    static int getHihoLen(String ss){
        char[] chars = ss.toCharArray();

       int j=-1;
       int min=Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            char c1=chars[i];
           // System.out.println(i+"===");
            //System.out.println(c1);
            if(isHolo(c1)){
                if(j==-1){
                    j=i+1;
                }
                while(j<chars.length){
                   // System.out.println(ss.substring(i,j+1));
                   // System.out.println(i);
                    if(isHolo(chars[j])&&isTrueNum(ss.substring(i,j+1).toCharArray())){
                        if(min>j-i+1){
                            min=j-i+1;
                        }
                        break;
                    }
                    j++;
                }
                j=-1;

            }


        }

        return min;
    }
    static boolean isHolo(char c){
        return c=='h'||c=='o'||c=='i';
    }
    static boolean isInclude(char []ss){

        return false;
    }
    static boolean isTrueNum(char []ss){
        int h=0;
        int o=0;

        int ii=0;
        for (int i = 0; i < ss.length; i++) {
            if(ss[i]=='h'){
                h++;
            }
            else if(ss[i]=='o'){
                o++;
            }
            else if(ss[i]=='i'){
                ii++;
            }
        }


        return h==2&&o==1&&ii==1;
    }
    public static void main(String[] args) {
        String ss="happyhahaiohell";
        int hihoLen = getHihoLen(ss);
        System.out.println(hihoLen);

    }
}
