package recursion;

import java.util.Arrays;

import org.junit.Test;

/**
 * @Description    ���õݹ�ʵ���������
 * @ClassName ArraySumTest
 * @Date 2019��5��5�� ����9:00:00
 * @Author Augue 939405780@qq.com
 */
public class ArraySumTest {

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 15};
        int sum = sum(arr);
        System.out.println("sum: " + sum);
    }

    /**
     * @param @param  arr
     * @param @return
     * @return int
     * @throws
     * @Description ���õݹ�ʵ���������
     * @Author Augue 939405780@qq.com
     * @Date 2019��5��5�� ����8:55:55
     */
    public static int sum(int[] arr) {
        // ��������
        if (arr.length == 1) {
            return arr[0];
        }
        // �ݹ�����
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
