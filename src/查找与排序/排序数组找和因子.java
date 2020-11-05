package 查找与排序;

public class 排序数组找和因子 {

    public static void fun(int []arr,int k){
        int b=0;
        int e=k-1;
        while(b<e){
            if(arr[b]+arr[e]==k){
                System.out.println("nums are "+arr[b]+"  "+arr[e]);
                b++;
                e--;
            }
            else if(arr[b]+arr[e]>k){
                e--;
            }
            else if(arr[b]+arr[e]<k){
                b++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-8,-4,-3,0,2,4,5,8,9,10};
        int k=10;
        fun(arr,k);
    }
}
