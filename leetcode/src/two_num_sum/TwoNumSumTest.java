package two_num_sum;

import java.util.HashMap;

/**
 * @Description leetcode 1.两数之和
 * @ClassName TwoNumSumTest
 * @Date 2019年4月23日 下午3:59:11
 * @Author Augue 939405780@qq.com
 */
public class TwoNumSumTest {

    /*
     * 	时间复杂度：O(n²)
     * 	空间复杂度：O(1)
     */
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    /*
     * 	时间复杂度：O(n)
     * 	空间复杂度：O(n) 因为哈希表中存储了n个元素
     *
     * 	用时相比嵌套循环的方法减少了，但是在内存消耗上增加。
     */
    public static int[] twoSumBest(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num) && map.get(num) != i) {
                return new int[]{i, map.get(num)};
            }
        }

        return null;
    }

    public static void main(String[] args) {

        int[] nums = {9, 5, 46, 15};
        int target = 52;
        int[] result = twoSum(nums, target);

        if (result == null) {
            System.out.println("没有结果!");
        } else {
            for (int i : result) {
                System.out.println(i);
            }
        }
    }
}
