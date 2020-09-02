package recursion;

/**
 * @Description    ���õݹ飬ʵ�ֵ���ʱ
 * @ClassName MainTest
 * @Date 2019��4��29�� ����9:36:03
 * @Author Augue 939405780@qq.com
 */
public class MainTest {

    public static void main(String[] args) {
        int i = 10;
        cutOne(i);
    }

    /*
     * ÿ���ݹ麯�����������֣������������ݹ�����
     */
    public static void cutOne(int i) {

        System.out.println(i);

        // ��������
        if (i == 0) {
            return;
        }
        // �ݹ�����
        i--;
        cutOne(i);
    }
}
