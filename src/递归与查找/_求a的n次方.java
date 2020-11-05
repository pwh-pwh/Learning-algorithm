package 递归与查找;

public class _求a的n次方 {

    static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int r=a;
        int e=1;
        while((e<<1)<n){
            r*=r;
            e<<=1;
        }
        return r*pow(a,n-e);
    }
    public static void main(String[] args) {
        System.out.println(pow(5, 3));
    }
}
