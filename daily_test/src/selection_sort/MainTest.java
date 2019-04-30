package selection_sort;
/**
 * 
 * @Description	选择排序算法测试类
 * @ClassName	MainTest
 * @Date		2019年4月23日 下午3:36:10
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		int[] arr = {4, 2, 15, 35, 12, 54, 36};
		
//		System.out.println("length: " + arr.length);
		System.out.print("交换前: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		for (int i = 0; i < arr.length - 1; i ++) {
			int k = i;
			for (int j = k + 1; j < arr.length; j ++) { // 选最小的记录
				if (arr[j] < arr[k]) {
					k = j; // 记录最小的值的下标值
				}
			}
			// 内层循环结束，也就是找到本轮最小的数，再进行交换。
			if (i != k) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		
		System.out.println();
		System.out.print("交换后: ");
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
