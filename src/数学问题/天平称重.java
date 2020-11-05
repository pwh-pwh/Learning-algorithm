package 数学问题;

import java.util.ArrayList;
import java.util.Scanner;

/*用天平称重时，我们希望用尽可能少的砝码组合称出尽可能多的重量。
 如果有无限个砝码，但它们的重量分别是1，3，9，27，81，……等3的指数幂
 神奇之处在于用它们的组合可以称出任意整数重量（砝码允许放在左右两个盘中）。
 本题目要求编程实现：对用户给定的重量，给出砝码组合方案，重量<1000000。
 例如：
 用户输入：
 5
 程序输出：
 9-3-1
 用户输入：
 19
 程序输出：
 27-9+1
 要求程序输出的组合总是大数在前小数在后。
 可以假设用户的输入一定是一个大于0的整数。*/
public class 天平称重 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        String x = Integer.toString(N, 3);
        char[] chars = new StringBuilder(x).reverse().toString().toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='2'){
                list.add(0,-1);
                if(i==chars.length-1){
                    list.add(0,1);
                }
                else{
                    ++chars[i+1];
                }
            }
            else if(chars[i]=='3'){
                list.add(0,0);
                if(i==chars.length-1){
                    list.add(0,1);
                }
                else{
                    ++chars[i+1];
                }
            }
            else{
                list.add(0,chars[i]-'0');
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                sb.append("+").append((int) Math.pow(3, list.size() - i - 1));
            }
            if (list.get(i) == -1) {
                sb.append("-").append((int) Math.pow(3, list.size() - i - 1));
            }
        }
        System.out.println(sb.toString());
    }
}
