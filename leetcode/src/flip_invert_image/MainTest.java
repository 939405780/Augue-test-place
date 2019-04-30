package flip_invert_image;

/**
 * 
 * @Description leetcode 832.翻转图像
 * @ClassName	MainTest
 * @Date		2019年4月28日 下午2:23:05
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	/*
	 * 	时间复杂度：O(n^2)
	 * 	空间复杂度：O(1)
	 */
	public static int[][] flipAndInvertImage(int[][] val) {
		
		for (int i = 0; i < val.length; i ++) {
			for (int j = 0; j < val[i].length / 2; j ++) { // 此处对val的每个元素数组进行翻转操作。
				int temp = val[i][j];
				val[i][j] = val[i][val[i].length - 1 - j];
				val[i][val[i].length - 1 - j] = temp;
			}
			for (int j = 0; j < val[i].length; j ++) { // 元素值1, 0变化
				if (val[i][j] == 0) {
					val[i][j] = 1;
				} else {
					val[i][j] = 0;
				}
			}
		}
		
        return val;
    }
	
	public static void main(String[] args) {
		
		int[][] val = {{1, 1, 0}, {0, 1, 0}, {1, 0, 1}};
		
		val = flipAndInvertImage(val);
		
		for (int[] arr : val) {
			System.out.print("array:");
			for (int i : arr) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
		
	}
}
