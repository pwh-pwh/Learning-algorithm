package 数学问题;

import java.util.Scanner;

public class HDU1576 {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int n,b;
            n= sc.nextInt();
            b=sc.nextInt();
            ExtGcd.inverseElement(b,9973);
           // System.out.println("num="+num);
            System.out.println(ExtGcd.x*n%9973);
        }
      //  System.out.println(num);

    }
    public static class ExtGcd{
        static long x;
        static long y;
        public static long gcd(long m, long n) {
            return n == 0 ? m : gcd(n, m % n);
        }
        /**
         * 扩展欧几里得
         * 调用完成后xy是ax+by=gcd(a,b)的解*/
        public static long ext_gcd(long a,long b){
            if(b==0){
                x=1;
                y=0;
                return a;
            }
            long res = ext_gcd(b,a % b);
            long x1=x;
            x=y;
            y=x1-a/b*y;
            return res;
        }
        /**
         * 线性方程
         * ax+by=m 当m时gcd(a,b)倍数时有解
         * 等价于ax = m mod b*/
        public static long linearEquation(long a, long b, long m) throws Exception {
            long d = ext_gcd(a, b);
            //m不是gcd(a,b)的倍数,这个方程无解
            if (m % d != 0) {
                throw new Exception(m + " % " + "gcd(" + a + "," + b + ")" + " != 0~~无解");
            }
            long n = m / d;//约一下,考虑m是d的倍数
            x *= n;
            y *= n;
            return d;
        }
        /**
         * 求逆元
         * ax = 1 (% mo),gcd(a,mo)=1
         * ax+mo*y=1
         * */
        public static long inverseElement(long a, long mo) throws Exception {

            long d = linearEquation(a, mo, 1);//ax+mo*y=1
            x = (x % mo + mo) % mo;//保证x>0
            return d;
        }

    }

}
