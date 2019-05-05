package recursion;

import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @Description	利用递归实现数组求和
 * @ClassName	ArraySumTest
 * @Date		2019年5月5日 上午9:00:00
 * @Author		Augue 939405780@qq.com
 */
public class ArraySumTest {
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 10, 15};
		int sum = sum(arr);
		System.out.println("sum: " + sum);
	}
	/**
	 * 
	 * @Description 利用递归实现数组求和
	 * @Author		Augue 939405780@qq.com
	 * @Date		2019年5月5日 上午8:55:55
	 * @param @param arr
	 * @param @return 
	 * @return int  
	 * @throws
	 */
	public static int sum(int[] arr) {
		// 基线条件
		if (arr.length == 1) {
			return arr[0];
		}
		// 递归条件
		return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
	}
	
	@Test
	public void test() {
		int[] arr = {1, 2, 3, 4};
		
		arr = Arrays.copyOfRange(arr, 1, arr.length);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
