package sort_array_square;

import java.util.Arrays;

/**
 * @Description leetcode 977.���������ƽ��
 * @ClassName MainTest
 * @Date 2019��4��29�� ����10:17:29
 * @Author Augue 939405780@qq.com
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
     * ʱ�临�Ӷȣ�O(n + n^2) "��һ��ѭ��n�� + �ڶ���Ƕ��ѭ��n^2��"
     * �ռ临�Ӷȣ�O(1)
     */
    public static int[] sortedSquares(int[] A) {

        // ��������ÿ��Ԫ�ص�ƽ��ֵ
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        // ����ð������
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
//		// ���ܱ�����ð������ʵ��Ҫ�ߺܶ�
//		Arrays.sort(A);

        return A;
    }
}
