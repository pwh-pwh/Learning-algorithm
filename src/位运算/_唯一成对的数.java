package 位运算;

import java.util.Arrays;
import java.util.Random;

public class _唯一成对的数 {
    public static void swap(int arr[],int a1,int a2){
        int temp=arr[a1];
        arr[a1]=arr[a2];
        arr[a2]=temp;
    }
    public static void main(String[] args) {
        int N=11;
        int[]arr=new int[N];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i]=i+1;
        }
        arr[arr.length-1]=new Random().nextInt(N-1)+1;
        int index=new Random().nextInt(N);
        swap(arr,index,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------");
        int x1=0;
        for (int i = 1; i < N; i++) {
            x1=(x1^i);

        }
        for (int i = 0; i < N; i++) {
            x1=x1^arr[i];
        }
        System.out.println(x1);

    }
}
