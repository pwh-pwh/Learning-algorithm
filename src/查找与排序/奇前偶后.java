package 查找与排序;

import java.util.Arrays;

public class 奇前偶后 {

    public static void main(String[] args) {

        int arr[]={1,4,2,3,5,8,11,41,26};
        fun2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void fun(int []arr){
        int left=0;
        int current=0;
        int end=arr.length;
        int[] temp = Arrays.copyOf(arr, arr.length);
        int right=arr.length-1;
        while(current<end){
            if(temp[current]%2!=0){


                arr[left]=temp[current];
                left++;
                current++;
            }
            else{
                arr[right]=temp[current];
                right--;
                current++;
            }

        }
    }
    static void fun2(int []arr){
        int right=arr.length-1;
        int left=0;
        while(right>left){
            while(arr[left]%2!=0){
                left++;
            }
            while(arr[right]%2==0){
                right--;
            }
            if(right>left){
                swap(arr,left,right);
            }else{
                return;
            }

        }
    }
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
