package dijkstra_s_algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

/**
 * @Description    �ҿ�˹�����㷨javaʵ��
 * @ClassName MainTest
 * @Date 2019��6��4�� ����9:37:37
 * @Author Augue 939405780@qq.com
 */
public class MainTest {
    /**
     * @Description �㷨���裺
     * 1. �ж��Ƿ���δ����Ľڵ�
     * 2. ���У�����������������Ľڵ�
     * 3. �����ýڵ������ھӲ������俪��
     * 4. ������ھӵĿ��������£�ͬʱ���¸��ڵ�
     * 5. �ýڵ���Ϊ�Ѵ���
     * 6. �ظ���1��
     */
    // ����û����֪����·���ı��
    private static int NOWAY_SIGN = Integer.MAX_VALUE;
    private static String START = "start";
    private static String END = "end";

    public void getMinStep(String start, String end, Map<String, Map<String, Integer>> graph) {
        // ���ڵ�����ٻ���
        Map<String, Integer> costs = graph.get(start);
        // ���ڵ����ٻ���ʱ�ĸ��ڵ�
        Map<String, String> parents = new HashMap<>();
        // �Ѵ���Ľڵ�
        HashSet<String> processed = new HashSet<>(); // �����ظ�
        // ��δ����Ľڵ����ҵ�������С�Ľڵ�
        String node = findLowestCostNode(costs, processed);

        while (node != null && graph.get(node) != null) {
            int cost = costs.get(node);
            // ������ǰ�ڵ�������ھ�
            Iterator iterator = graph.get(node).entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
                // ͨ��node�ڵ㵽�ýڵ����С����
                int newCost = cost + entry.getValue();
                // ���´�start���ýڵ����С����
                if (!costs.containsKey(entry.getKey()) || costs.get(entry.getKey()) > newCost) {
                    costs.put(entry.getKey(), newCost);
                    parents.put(entry.getKey(), node);
                }
            }

            // �ýڵ�����Ѵ���
            processed.add(node);
            // �ҳ���ǰ��С���ĵĽڵ�
            node = findLowestCostNode(costs, processed);
        }
        printPath(parents, costs.get(END));
    }

    public void printPath(Map<String, String> parents, int cost) {
        Stack<String> stack = new Stack<>();
        String parent = parents.get(END);

        while (parent != null) {
            if (START.equalsIgnoreCase(parent)) {
                stack.push(START);
                break;
            }
            stack.push(parent);
            parent = parents.get(parent);
        }

        StringBuffer path = new StringBuffer();
        while (!stack.empty()) {
            String node = stack.pop();
            if (path.length() != 0) {
                path.append("->");
            }
            path.append(node);
        }

        System.out.println("����·��Ϊ��" + START + "->" + path.toString() + "->" + END);
        System.out.println("�俪��Ϊ��" + cost);

    }

    /**
     * @param @param  costs
     * @param @param  processed
     * @param @return
     * @return String
     * @throws
     * @Description ��δ����Ľڵ����ҵ�������С�Ľڵ�
     * @Author Augue 939405780@qq.com
     * @Date 2019��6��4�� ����10:29:21
     */
    public String findLowestCostNode(Map<String, Integer> costs, HashSet<String> processed) {

        int lowestCost = NOWAY_SIGN;
        String lowestCostNode = null;
        Iterator iterator = costs.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = (Entry<String, Integer>) iterator.next();
            // �Ѵ���ڵ��в������˽ڵ�, ���һ���ʱ��С����С����
            if (!processed.contains(entry.getKey()) && entry.getValue() < lowestCost) {
                lowestCost = entry.getValue();
                lowestCostNode = entry.getKey();
            }
        }

        return lowestCostNode;
    }

    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = new HashMap<>();
        Map<String, Integer> start = new HashMap<>();
        start.put("A", 5);
        start.put("B", 2);
        graph.put(START, start);
        Map<String, Integer> a = new HashMap<>();
        a.put("C", 4);
        a.put("D", 2);
        graph.put("A", a);
        Map<String, Integer> b = new HashMap<>();
        b.put("A", 8);
        b.put("D", 7);
        graph.put("B", b);
        Map<String, Integer> c = new HashMap<>();
        c.put("D", 6);
        c.put(END, 3);
        graph.put("C", c);
        Map<String, Integer> d = new HashMap<>();
        d.put(END, 1);
        graph.put("D", d);
        MainTest t = new MainTest();
        t.getMinStep(START, END, graph);
    }
}
