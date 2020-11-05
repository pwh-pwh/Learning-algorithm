package 位运算;

import java.util.Scanner;

public class _是否2的整数次方 {
    public static void main(String[] args) {
        int N=new Scanner(System.in).nextInt();
        if((N&(N-1))==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

}
