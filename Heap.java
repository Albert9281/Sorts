public class Heap {
    public void heapSort(int[] arr){
        arr = buildMaxHeap(arr);
        for(int i=arr.length-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustDownToUp(arr,0,i);
        }
    }
    private int[] buildMaxHeap(int[] arr){
        for (int i=(arr.length-2)/2; i>=0; i--){
            adjustDownToUp(arr,i,arr.length);
        }
        return arr;
    }
    private void adjustDownToUp(int[] arr, int k, int length){
        int temp = arr[k];
        for(int i=2*k+1; i<length-1; i=2*i+1){
            if(i<length && arr[i]<arr[i+1]){
                i++;
            }
            if(temp>=arr[i]){
                break;
            }else{
                arr[k] = arr[i];
                k = i;
            }
        }
        arr[k] = temp;
    }
}
