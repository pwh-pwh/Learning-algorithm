package 数学问题;

import java.util.Scanner;

public class Frog_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,m,n,l;
        x=sc.nextInt();
        y= sc.nextInt();
        m= sc.nextInt();
        n= sc.nextInt();
        l=sc.nextInt();
        long result;
        try {
            long rr=ExtGcd.linearEquation(m - n, l, y - x);
            rr=l/rr;
            rr=(rr>0?rr:-rr);
            result=(ExtGcd.x%rr+rr)%rr;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Impossible");
        }


    }
    public static class ExtGcd{
        static long x;
        static long y;

        public static long gcd(long m, long n) {
            return n == 0 ? m : gcd(n, m % n);
        }

        /**
         * 最小公倍数lowest common multiple (LCM)
         * @param a
         * @param b
         * @return
         */
        public static long lcm(long a, long b) {
            return a * b / gcd(a, b);
        }

        /**
         * 扩展欧几里得
         * 调用完成后xy是ax+by=gcd(a,b)的解*/
        public static long ext_gcd(long a, long b) {

            if (b == 0) {
                x = 1;
                y = 0;
                return a;
            }
            long res = ext_gcd(b, a % b);
            //x,y已经被下一层递归更新了,ppt中所说的x0和y0
            long x1 = x;//备份x
            x = y;//更新x
            y = x1 - a / b * y;//更新y
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
    }

}
