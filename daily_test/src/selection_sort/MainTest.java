package selection_sort;

/**
 * @Description ѡ�������㷨������
 * @ClassName MainTest
 * @Date 2019��4��23�� ����3:36:10
 * @Author Augue 939405780@qq.com
 */
public class MainTest {

    public static void main(String[] args) {

        int[] arr = {4, 2, 15, 35, 12, 54, 36};

//		System.out.println("length: " + arr.length);
        System.out.print("����ǰ: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = k + 1; j < arr.length; j++) { // ѡ��С�ļ�¼
                if (arr[j] < arr[k]) {
                    k = j; // ��¼��С��ֵ���±�ֵ
                }
            }
            // �ڲ�ѭ��������Ҳ�����ҵ�������С�������ٽ��н�����
            if (i != k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }

        System.out.println();
        System.out.print("������: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
