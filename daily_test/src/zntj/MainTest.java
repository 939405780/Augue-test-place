package zntj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description    ���������Ƽ������ö���ʵ�������Ƽ��ֲ���
 * @ClassName MainTest
 * @Date 2019��5��30�� ����10:35:45
 * @Author Augue 939405780@qq.com
 */
public class MainTest {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();

        list.add("1. ���а��һ");
        list.add("2. ����");
        list.add("3. ����");
        list.add("4. ������");
        list.add("5. �ɿڿ���");
        list.add("6. ����");

        queue.addAll(list);

        showThree(queue);
        showThree(queue);
        showThree(queue);

    }

    public static void showThree(Queue<String> queue) {
        System.out.println("-----------start------------");

        // ÿ����ʾ������Ϣ, ������ѭ����ʾ��
        for (int i = 0; i < 3; i++) {
            String str = queue.poll();
            System.out.println(str);
            queue.add(str);
        }

        System.out.println("-----------end------------");
    }
}
