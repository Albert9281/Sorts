
public class Test {
    public static void main(String[] args) {
        int[] array = {9,7,6,8,5,4,3,2,1};
//        冒泡
//        Bubble bubble = new Bubble();
//        bubble.bubble(array);
        //快速排序
//        Quick quick = new Quick();
//        quick.quick(array);
        //堆排序
//        Heap heap = new Heap();
//        heap.heapSort(array);
        //选择排序
        Select select = new Select();
        select.selectSort(array);
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
    }
}
