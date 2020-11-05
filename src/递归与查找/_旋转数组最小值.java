package 递归与查找;
public class _旋转数组最小值 {
    static int fun(int []arr){
        int begin=0;
        int end=arr.length-1;
        if(arr[begin]<arr[end]){
            return arr[begin];
        }
        while(begin+1<end){
            int mid=begin+((end-begin)>>1);
            if(arr[mid]>=arr[begin]){
                begin=mid;
            }else{
                end=mid;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int []arr={4,5,9,85,-99,-12,-9,1,2,3};
        System.out.println(fun(arr));
    }
}
