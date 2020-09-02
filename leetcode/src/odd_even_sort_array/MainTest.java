package odd_even_sort_array;

/**
 * @Description leetcode 905.
 * @ClassName MainTest
 * @Date 2019��5��6�� ����8:47:20
 * @Author Augue 939405780@qq.com
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
     * @param @param  A
     * @param @return
     * @return int[]
     * @throws
     * @Description �Լ�д�Ĵ���
     * @Author Augue 939405780@qq.com
     * @Date 2019��5��6�� ����8:48:27
     */
    public static int[] sortArrayByParity(int[] A) {

        int[] arr = new int[A.length];
        int num = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[num++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                arr[num++] = A[i];
            }
        }

        return arr;
    }

    /**
     * @param @param  A
     * @param @return
     * @return int[]
     * @throws
     * @Description ʹ��˫ָ��ʵ��
     * @Author Augue 939405780@qq.com
     * @Date 2019��5��6�� ����8:49:35
     */
    public static int[] sortArrayByParity2(int[] A) {

        if (A.length <= 0) {
            return A;
        }

        int left = 0; // ��
        int right = A.length - 1; // ��
        int temp;
        while (left < right) {

            if (left < A.length && A[left] % 2 == 0) {
                left++;
            }

            if (right >= 0 && A[right] % 2 != 0) {
                right--;
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
