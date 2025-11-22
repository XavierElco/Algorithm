import java.util.Arrays;

public class FindLeft {
    public static void main(String[] args) {

        int len = 100;
        int randomValue = 100;
        int testTime = 200;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int n = (int)(Math.random() * len);
            int[] arr = RandomArray(n, randomValue);
            Arrays.sort(arr);
            int num = (int)(Math.random() * randomValue);
            if (FindLeftAlgorithm(arr, num) != check(arr, num)) {
                System.out.println("出错了");
            }
            System.out.println("测试成功");
        }
    }


    /**
     *  二分查找找到数组中大于num的最左数。
     * @param arr
     * @param num
     * @return
     */
    public static int FindLeftAlgorithm(int[] arr, int num) {
        if (arr.length == 0) {
            return -1;
        }

        int ans = -1;
        int left = 0, right = arr.length-1;
        int mid;
        while (left <= right) {
            mid = (left + right)/2;
            if (arr[mid] >= num) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int[] RandomArray(int len, int value) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int)(Math.random() * value) + 1;
        }
        return arr;
    }

    public static int check (int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        return -1;
    }
}
