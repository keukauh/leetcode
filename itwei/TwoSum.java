import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */

public class TwoSum {
    public static void main(String[] args) {
        int[] test = {2 ,7 ,9, 11};
        int target = 9;
        int[] result = solute(test, target);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    private static int[] solute(int[] nums, int target) {
        int[] result = new int[2];
        //用来装数组里每个数的补数
        HashMap<Integer,Integer> complementaryNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            //出现了某个数的补数，说明出来结果了
            if (complementaryNumber.containsKey(nums[i])){
                result[0] = complementaryNumber.get(nums[i]);
                result[1] = i;
                return result;
            }
            complementaryNumber.put(target - nums[i], i);
        }
        return result;
    }
}
