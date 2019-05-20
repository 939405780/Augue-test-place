package bfs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 
 * @Description 广度优先搜索算法 (BFS)
 * @ClassName	MainTest
 * @Date		2019年5月16日 上午9:13:43
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	private static Map<String , List<String>> map = new HashMap<String , List<String>>();
	/**
	 * BFS 使用队列来实现算法
	 */
	private static Queue<String> queue = new LinkedList<String>();
	private static Map<String, Boolean> status = new HashMap();
	
	public static void main(String[] args) {
		
		init();
		BFSSearch("4");
		
	}
	
	public static void init() {
		/*
		 * 	图结构如下
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
	 * 
	 * @Description 开始点
	 * @Author		Augue 939405780@qq.com
	 * @Date		2019年5月16日 上午10:26:51
	 * @param @param startPoint 
	 * @return void  
	 * @throws
	 */
	public static void BFSSearch(String startPoint) {
		// 把起始点放入队列
		queue.add(startPoint);
		status.put(startPoint, false);
		bfsLoop();
	}
	
	private static void bfsLoop() {
		// 1. 从queue中取出队列头的点；更新状态为已经遍历。
		String currentQueueHeader = queue.poll(); // 出队
		status.put(currentQueueHeader, true);
		System.out.println(currentQueueHeader);
		// 2. 找出与此点邻接的且尚未遍历的点，进行标记，然后全部放入queue中。
		List<String> neighborPoints = map.get(currentQueueHeader);
		for (String point : neighborPoints) {
			/**
			 * getOrDefault(key, value);
			 * map中有这个key时，获取的是这个key的值，如果没有这个key，则获取的是默认值false。
			 */
			if (!status.getOrDefault(point, false)) {
				// 未被遍历
				if (queue.contains(point)) {
					continue;
				}
				queue.add(point);
				status.put(point, false);
			}
		}
		if (!queue.isEmpty()) { // 如果队列不为空继续遍历
			bfsLoop();
		}
	}
	
	
}
