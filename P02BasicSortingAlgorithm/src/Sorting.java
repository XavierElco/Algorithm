import java.security.PublicKey;

public class Sorting {


    /**
     * 选择排序就是从i- arrSize-1 中反复找到最小的，放在数组的前面， index初始值为0，每做一次
     * swap就右移一次
     * 1. 从index 0 开始用循环去找最小的书
     * 2. 发现最小的数-》把它和index 0 做交换
     * 3. index右移
     * @param arr
     */
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 冒泡排序就是在 arrSize-1 的长度中从最左边的位置反复比较右边的值，如果左边的值比右边的大就swap
     * 不然就继续走，直到把最大的书数冒泡到右边
     * 45325
     * 1. 43525
     * 2. 43255
     * 3. 34225
     * 4. 32425
     * 5. 32245
     * 6. 23245
     * 7. 22345
     */
    public static int[] bubbleSort(int[] arr){
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int size = arr.length;
        for (int end = size - 1; end > 0 ; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr,i, i+1);
                }
            }
        }
        return arr;
    }


    /**
     * 插入排序就是当前值和之前的值各比较一下，一个指针i走在前面，
     * 另一个指针j在后边向后遍历，如果遇到j位置的元素大于j+1位置的元素情况则直接换位位置
     * 结束向后遍历后，快指针向前遍历
     * @param arr
     */
    public static int[] insertSort (int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int size = arr.length;

        for (int i= 1; i < size ; i++) {
            for (int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--) {
                swap(arr, j, j+1);;
            }
        }
        return arr;
    }


}


