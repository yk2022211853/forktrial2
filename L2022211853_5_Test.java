import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 * 测试类 L12345678_5_Test
 *
 * 测试用例设计的总体原则：
 * 1. **等价类划分原则**：将输入数据划分为若干个等价类，从每个类中选取代表性的测试用例。
 * 2. **边界值分析原则**：特别关注边界值情况，测试用例应覆盖边界值及其相邻值。
 * 3. **错误推测原则**：推测可能出错的区域，设计测试用例以确保健壮性。
 * 4. **状态转换测试**：对状态变化敏感的情况进行测试，确保各个状态下的行为正确。
 */
public class L12345678_5_Test {

    // 测试目的：验证空数组的处理
    // 用到的测试用例：空数组，预期输出为0
    // 预期输出：0，因为没有任何子序列
    @Test
    public void testEmptyArray() {
        Solution5 solution = new Solution5();
        assertEquals(0, solution.numSubseq(new int[]{}, 10));
    }

    // 测试目的：验证单个元素数组的处理
    // 用到的测试用例：单元素数组，预期输出为1
    // 预期输出：1，因为只有一个子序列 [3] 满足条件
    @Test
    public void testSingleElement() {
        Solution5 solution = new Solution5();
        assertEquals(1, solution.numSubseq(new int[]{3}, 5));
    }

    // 测试目的：验证常规数组的处理
    // 用到的测试用例：常规数组 [3, 5, 6, 7]，预期输出为4
    // 预期输出：4，示例数组 [3,5,6,7] 满足的子序列有 [3], [3,5], [3,6], [3,5,6]
    @Test
    public void testNormalArray() {
        Solution5 solution = new Solution5();
        assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));
    }

    // 测试目的：验证大数组的处理及边界值
    // 用到的测试用例：大小为100000的数组，所有元素均为1
    // 预期输出：数组的所有非空子序列都满足条件，数量为 2^n - 1
    @Test
    public void testLargeArray() {
        Solution5 solution = new Solution5();
        int[] nums = new int[100000];
        Arrays.fill(nums, 1);
        assertEquals((int)((Math.pow(2, 100000) - 1) % 1000000007), solution.numSubseq(nums, 2));
    }
}
