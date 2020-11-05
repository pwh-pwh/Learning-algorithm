package 查找与排序;

import java.util.Arrays;

public class 归并排序 {
    public static void main(String[] args) {
        int[] arr = {20, 1, 10, 62, 25, 4, 9};
        mergerSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void mergerSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            mergerSort(arr, begin, mid);
            mergerSort(arr, mid + 1, end);
            merger(arr,begin,mid,end);
        }
    }

    static void merger(int[] arr, int begin, int mid, int end) {
        int[] newArr;
        newArr=Arrays.copyOf(arr,arr.length);
        int left=begin;
        int right=mid+1;
        int current=begin;
        while(left<=mid&&right<=end){
            if(newArr[left]<=newArr[right]){
                arr[current]=newArr[left];
                current++;
                left++;
            }else{
                arr[current]=newArr[right];
                current++;
                right++;
            }

        }
while(left<=mid){
    arr[current]=newArr[left];
    current++;
    left++;
}
    }
}
