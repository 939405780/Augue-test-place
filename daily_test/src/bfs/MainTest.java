package bfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @Description ������������㷨 (BFS)
 * @ClassName MainTest
 * @Date 2019��5��16�� ����9:13:43
 * @Author Augue 939405780@qq.com
 */
public class MainTest {

    private static Map<String, List<String>> map = new HashMap<String, List<String>>();
    /**
     * BFS ʹ�ö�����ʵ���㷨
     */
    private static Queue<String> queue = new LinkedList<String>(); // ��������
    private static Map<String, Boolean> status = new HashMap(); // ������¼״̬, ��¼�Ƿ��Ѿ�������

    public static void main(String[] args) {

        init();
        BFSSearch("4");

    }

    public static void init() {
        /*
         * 	ͼ�ṹ����
         * 		1
         * 	  /   \
         *   2     3
         *  / \   / \
         * 4   5  6  7
         * \  |  /\  /
         *    8     9
         */
        map.put("1", Arrays.asList("2", "3"));
        map.put("2", Arrays.asList("1", "4", "5"));
        map.put("3", Arrays.asList("1", "6", "7"));
        map.put("4", Arrays.asList("2", "8"));
        map.put("5", Arrays.asList("2", "8"));
        map.put("6", Arrays.asList("3", "8", "9"));
        map.put("7", Arrays.asList("3", "9"));
        map.put("8", Arrays.asList("4", "5", "6"));
        map.put("9", Arrays.asList("6", "7"));
    }

    /**
     * @param @param startPoint
     * @return void
     * @throws
     * @Description ��ʼ��
     * @Author Augue 939405780@qq.com
     * @Date 2019��5��16�� ����10:26:51
     */
    public static void BFSSearch(String startPoint) {
        // ����ʼ��������
        queue.add(startPoint);
        status.put(startPoint, false);
        bfsLoop();
    }

    private static void bfsLoop() {
        // 1. ��queue��ȡ������ͷ�ĵ㣻����״̬Ϊ�Ѿ�������
        String currentQueueHeader = queue.poll(); // ����
        status.put(currentQueueHeader, true);
        System.out.println(currentQueueHeader);
        // 2. �ҳ���˵��ڽӵ�����δ�����ĵ㣬���б�ǣ�Ȼ��ȫ������queue�С�
        List<String> neighborPoints = map.get(currentQueueHeader);
        for (String point : neighborPoints) {
            /**
             * getOrDefault(key, value);
             * map�������keyʱ����ȡ�������key��ֵ�����û�����key�����ȡ����Ĭ��ֵfalse��
             */
            if (!status.getOrDefault(point, false)) {
                // δ������
                if (queue.contains(point)) {
                    continue;
                }
                queue.add(point);
                status.put(point, false);
            }
        }
        if (!queue.isEmpty()) { // ������в�Ϊ�ռ�������
            bfsLoop();
        }
    }


}
