package quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @Description	快速排序（使用了递归）
 * @ClassName	MainTest
 * @Date		2019年5月5日 上午11:23:04
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		Integer[] arr = {10, 56, 43, 29, 37, 2, 5, 3};
		
		arr = quickSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	/**
	 * 
	 * @Description 快速排序，基准数为数组的第一个元素
	 * @Author		Augue 939405780@qq.com
	 * @Date		2019年5月5日 上午11:22:34
	 * @param @param arr
	 * @param @return 
	 * @return Integer[]  
	 * @throws
	 */
	public static Integer[] quickSort(Integer[] arr) {
		
		// 基线条件
		if (arr.length < 2) { // 数组元素小于二时直接返回
			return arr;
		}
		
		// 递归条件
		int point = arr[0]; // 基准数
		List<Integer> less = new ArrayList<>(); // 小于基准数的子数组
		List<Integer> greater = new ArrayList<>(); // 大于基准数的子数组
		
		for (int i = 1; i < arr.length; i ++) {
			if (arr[i] <= point) {
				less.add(arr[i]);
			} else {
				greater.add(arr[i]);
			}
		}
		
		Integer[] l = quickSort(less.toArray(new Integer[less.size()]));
		Integer[] g = quickSort(greater.toArray(new Integer[greater.size()]));
		
		List<Integer> result = new ArrayList<>(Arrays.asList(l));
		result.add(point);
		result.addAll(Arrays.asList(g));
		
		return result.toArray(new Integer[result.size()]);
	}
}
