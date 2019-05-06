package odd_even_sort_array;

/**
 * 
 * @Description	leetcode 905.
 * @ClassName	MainTest
 * @Date		2019年5月6日 上午8:47:20
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		int[] A = {2, 8, 13, 24, 4, 5, 9, 6, 14, 36};
		
		A = sortArrayByParity(A);
		
		for (int i : A) {
			System.out.println(i);
		}
	}
	
	/**
	 * 
	 * @Description 自己写的代码
	 * @Author		Augue 939405780@qq.com
	 * @Date		2019年5月6日 上午8:48:27
	 * @param @param A
	 * @param @return 
	 * @return int[]  
	 * @throws
	 */
	public static int[] sortArrayByParity(int[] A) {
		
		int[] arr = new int[A.length];
		int num = 0;
		
		for (int i = 0; i < A.length; i ++) {
			if (A[i] % 2 == 0) {
				arr[num ++] = A[i];
			}
		}
		for (int i = 0; i < A.length; i ++) {
			if (A[i] % 2 != 0) {
				arr[num ++] = A[i];
			}
		}
		
        return arr;
    }
	
	/**
	 * 
	 * @Description 使用双指针实现
	 * @Author		Augue 939405780@qq.com
	 * @Date		2019年5月6日 上午8:49:35
	 * @param @param A
	 * @param @return 
	 * @return int[]  
	 * @throws
	 */
	public static int[] sortArrayByParity2(int[] A) {

        if (A.length <= 0) {
            return A;
        }
        
        int left = 0; // 左
        int right = A.length - 1; // 右
        int temp;
        while (left < right) {
        	
            if (left < A.length && A[left] % 2 == 0) {
            	left ++;
            }
            
            if (right >= 0 && A[right] % 2 != 0) {
            	right --;
            }
            
            if (left < right) {
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
        }
        
        return A;
    }
}
