package zntj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @Description	测试智能推荐（利用队列实现智能推荐轮播）
 * @ClassName	MainTest
 * @Date		2019年5月30日 上午10:35:45
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		List<String> list = new ArrayList<>();
		
		list.add("1. 排行榜第一");
		list.add("2. 怡宝");
		list.add("3. 百利");
		list.add("4. 蛋黄派");
		list.add("5. 可口可乐");
		list.add("6. 联想");
		
		queue.addAll(list);
		
		showThree(queue);
		showThree(queue);
		showThree(queue);
		
	}
	
	public static void showThree(Queue<String> queue) {
		System.out.println("-----------start------------");
		
		// 每次显示三条信息, 并可以循环显示。
		for (int i = 0; i < 3; i ++) {
			String str = queue.poll();
			System.out.println(str);
			queue.add(str);
		}
		
		System.out.println("-----------end------------");
	}
}
