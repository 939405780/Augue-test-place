package sort_array_square;

import java.util.Arrays;

/**
 * 
 * @Description	leetcode 977.有序数组的平方
 * @ClassName	MainTest
 * @Date		2019年4月29日 上午10:17:29
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		int[] A = {-4, -1, 0, 3, 10};
		
		A = sortedSquares(A);
		System.out.print("array:");
		for (int i : A) {
			System.out.print(" " + i);
		}
	}
	
	/*
	 * 时间复杂度：O(n + n^2) "第一个循环n次 + 第二个嵌套循环n^2次"
	 * 空间复杂度：O(1)
	 */
	public static int[] sortedSquares(int[] A) {
		
		// 计算数组每个元素的平方值
		for (int i = 0; i < A.length; i ++) {
			A[i] = A[i] * A[i];
		}
		// 利用冒泡排序
		for (int i = 0; i < A.length - 1; i ++) {
			for (int j = 0; j < A.length - i - 1; j ++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
//		// 性能比利用冒泡排序实现要高很多
//		Arrays.sort(A);
		
        return A;
    }
}
