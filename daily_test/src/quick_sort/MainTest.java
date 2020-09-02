package quick_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description    ��������ʹ���˵ݹ飩
 * @ClassName MainTest
 * @Date 2019��5��5�� ����11:23:04
 * @Author Augue 939405780@qq.com
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
     * @param @param  arr
     * @param @return
     * @return Integer[]
     * @throws
     * @Description �������򣬻�׼��Ϊ����ĵ�һ��Ԫ��
     * @Author Augue 939405780@qq.com
     * @Date 2019��5��5�� ����11:22:34
     */
    public static Integer[] quickSort(Integer[] arr) {

        // ��������
        if (arr.length < 2) { // ����Ԫ��С�ڶ�ʱֱ�ӷ���
            return arr;
        }

        // �ݹ�����
        int point = arr[0]; // ��׼��
        List<Integer> less = new ArrayList<>(); // С�ڻ�׼����������
        List<Integer> greater = new ArrayList<>(); // ���ڻ�׼����������

        for (int i = 1; i < arr.length; i++) {
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
