package 递归与查找;

import java.util.Scanner;

public class _小白上楼梯 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int r=f(i);
        System.out.println(r);
    }

    private static int f(int i) {
       if(i==3){
           return 4;
       }
       if(i==1){
           return 1;
       }
       if(i==2){
           return 2;
       }
       return f(i-1)+f(i-2)+f(i-3);
    }
}
