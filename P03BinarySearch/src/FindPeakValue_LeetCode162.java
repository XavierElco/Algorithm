
// https://leetcode.cn/problems/find-peak-element/
public class FindPeakValue_LeetCode162 {
    public static int findPeak(int[] num) {
        if (num.length == 0) {
            return -1;
        }

        if (num == null) {
            return -1;
        }

        if (num.length == 1) {
            return 0;
        }

        if (num[0] > num[1]) {
            return 0;
        }

        if (num[num.length - 1] > num[num.length - 2]) {
            return num.length - 1;
        }

        int mid;
        int ans = -1;
        int left = 1;
        int right = num.length - 2;
        while (left <= right) {
            mid = (left + right) / 2;

            if (num[mid-1] > num[mid]) {
                right = mid - 1;
            } else if (num[mid] < num[mid + 1]) {
                left = mid + 1;
            } else {
                ans = mid;
                break;
            }

        }
        return ans;
     }
}
