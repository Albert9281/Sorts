public class Quick {
    public void quick(int[] arr){
        subQuicksort(arr,0,arr.length-1);
    }
    public void subQuicksort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int midNum = subQuicksortCore(arr,start,end);
        subQuicksort(arr, start,midNum-1);
        subQuicksort(arr, midNum+1,end);
    }
    public int subQuicksortCore(int[] arr, int start, int end){
        int midNum = arr[start];
        while(start < end){
            while (arr[end] >= midNum && start<end){
                end--;
            }
            arr[start] = arr[end];
            while(arr[start] <= midNum && start<end){
                start++;
            }
            arr[end] = arr[start];
        }
        arr[start] = midNum;
        return start;
    }
}
