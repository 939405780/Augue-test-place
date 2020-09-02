package flip_invert_image;

/**
 * @Description leetcode 832.��תͼ��
 * @ClassName MainTest
 * @Date 2019��4��28�� ����2:23:05
 * @Author Augue 939405780@qq.com
 */
public class MainTest {

    /*
     * 	ʱ�临�Ӷȣ�O(n^2)
     * 	�ռ临�Ӷȣ�O(1)
     */
    public static int[][] flipAndInvertImage(int[][] val) {

        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val[i].length / 2; j++) { // �˴���val��ÿ��Ԫ��������з�ת������
                int temp = val[i][j];
                val[i][j] = val[i][val[i].length - 1 - j];
                val[i][val[i].length - 1 - j] = temp;
            }
            for (int j = 0; j < val[i].length; j++) { // Ԫ��ֵ1, 0�仯
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
