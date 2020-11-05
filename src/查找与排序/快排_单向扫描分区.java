package 查找与排序;

import java.util.Arrays;

public class 快排_单向扫描分区 {
    public static void main(String[] args) {
        int []arr={2,5,1,0,32,4,12};
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
        int sp=begin+1;
        int bigger=end;
        while(sp<=bigger){
            if(arr[sp]<=pivot){
                sp++;
            }
            else{
                swap(arr,sp,bigger);
                bigger--;
            }

        }
swap(arr,begin,bigger);
        return bigger;

    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
