package 查找与排序;

import java.util.Arrays;

public class 快排_双向扫描分区 {
    public static void main(String[] args) {
        int []arr={2,12,0,3,5,9};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int []arr,int begin,int end){

        if(begin<end){
            int mid=partition(arr,begin,end);
            quicksort(arr,begin,mid-1);
            quicksort(arr,mid+1,end);
        }


    }
    public static int partition(int []arr,int begin,int end){
        int pivot=arr[begin];
        int left=begin+1;
        int right=end;
        while(left<=right){
            while(left<=right&&arr[left]<=pivot){
                left++;
            }
            while(left<=right&&arr[right]>pivot){
                right--;
            }
            if(left<right){
                swap(arr,right,left);
            }


        }
swap(arr,begin,right);
        return right;
    }

    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
