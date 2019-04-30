package recursion;

/**
 * 
 * @Description	利用递归，实现倒计时
 * @ClassName	MainTest
 * @Date		2019年4月29日 上午9:36:03
 * @Author		Augue 939405780@qq.com
 */
public class MainTest {
	
	public static void main(String[] args) {
		int i = 10;
		cutOne(i);
	}
	
	/*
	 * 每个递归函数都有两部分：基线条件、递归条件
	 */
	public static void cutOne(int i) {
		
		System.out.println(i);
		
		// 基线条件
		if (i == 0) {
			return;
		}
		// 递归条件
		i --;
		cutOne(i);
	}
}
