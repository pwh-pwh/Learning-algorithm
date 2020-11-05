package 位运算;

import java.util.Scanner;

public class _将整数的奇偶位互换 {
    public static void main(String[] args) {
        int N=new Scanner(System.in).nextInt();
        int ou=N&0xaaaaaaaa;
        int ji=N&0x55555555;
        System.out.println((ou>>1)^(ji<<1));
    }
}
