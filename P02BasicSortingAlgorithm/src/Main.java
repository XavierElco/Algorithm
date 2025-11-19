import java.util.Arrays;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {

        int N = 5000; // 随机数组最大长度

        int V = 10000; // 随机数组每个值在1-V之间等概率随机
        int testTimes = 1000; // 测试次数
        System.out.println("测试开始");

        for (int i = 0; i < testTimes; i++) {
            // 随机得到一个长度，长度在·【0～N-1】
            int n = (int) (Math.random() * N);
            // 得到随机数组
            int[] arr = randomArray(n, V);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            int[] arr3 = copyArray(arr);
            Sorting.selectionSort(arr1);
            Sorting.bubbleSort(arr2);
            Sorting.insertSort(arr3);
            System.out.println("1排序后");
            System.out.println(Arrays.toString(arr1));
            System.out.println("2排序后");
            System.out.println(Arrays.toString(arr2));
            System.out.println("3排序后");
            System.out.println(Arrays.toString(arr3));
            if (!sameArray(arr1, arr2) || !sameArray(arr1, arr3)) {
                System.out.println("出错了!");
                // 当有错了
                // 打印是什么例子，出错的
                // 打印三个功能，各自排序成了什么样
                // 可能要把例子带入，每个方法，去debug！
            }

            System.out.println("测试结束");
        }



    }
    // 为了验证
    // 得到一个随机数组，长度是n
    // 数组中每个数，都在1~v之间，随机得到
    public static int[] randomArray(int n, int v) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // Math.random() -> double -> [0,1)范围山的一个小数，0.37463473126、0.001231231，等概率！
            // Math.random() * v -> double -> [0,v)一个小数，依然等概率
            // (int)(Math.random() * v) -> int -> 0 1 2 3 ... v-1，等概率的！
            // (int) (Math.random() * v) + 1 -> int -> 1 2 3 .... v，等概率的！
            arr[i] = (int) (Math.random() * v) + 1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // 为了验证
    public static int[] copyArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    // 为了验证
    public static boolean sameArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}