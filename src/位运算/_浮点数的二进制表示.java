package 位运算;

public class _浮点数的二进制表示 {
    public static void main(String[] args) {
       double num=0.5;
        StringBuilder sb = new StringBuilder("0.");
        while(num>0){
            double r=num*2;
            if(r>=1){
                sb.append("1");
                num=num-1;

            }else{
                sb.append("0");
                num=r;

            }
            if(sb.length()>34){
                System.out.println("error");
                return;
            }
        }
        System.out.println(sb.toString());
    }
}
