import java.util.Arrays;

public class BasicBinarySearch {
    public static void main(String[] args) {

        int V = 1000;
        int N = 2000;
        int testTime = 1000;

        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int n = (int)(Math.random() * N);
            int[] arr = randomArray(n, V);
            Arrays.sort(arr);
            int num = (int) (Math.random() * V) ;
            if (baseCheck(arr, num) != exist(arr, num)) {
                System.out.println("测试失败");
            }
        }
        System.out.println("测试成功");

    }


    public static int[] randomArray(int n, int v) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * v) + 1;
        }
        return arr;

    }

    public static boolean baseCheck (int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }

    // 数是否存在得二分查找
    public static boolean exist(int[] arr, int num) {
        if (arr.length == 0) {
            return false;
        }

        if (arr.length == 1) {
            return arr[0] == num;
        }

        int left = 0, right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (right + left) / 2; // 偏移量

            if (num < arr[mid]) {
                right = mid - 1;
            } else if (num > arr[mid]) {
                left = mid + 1;
            }

            if (num == arr[mid]) {
                return true;
            }
        }
        return false;
    }
}