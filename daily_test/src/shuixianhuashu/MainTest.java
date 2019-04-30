package shuixianhuashu;

import java.util.Scanner;

/**
 * 水仙花数
 * @author Augue
 *
 */
public class MainTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			StringBuilder sb = new StringBuilder();
			for (int i = m; i <= n; i ++) { // 遍历m~n之间所有的整数
				int bw = i / 100;
				int sw = i % 100 / 10;
				int gw = i % 10;
				if (i == (Math.pow(bw, 3) + Math.pow(sw, 3) + Math.pow(gw, 3))) {
					sb.append(i + " ");
				}
			}
			if (sb.length() > 0) {
				System.out.println(sb.toString());
			} else {
				System.out.println("no");
			}
		}
	}
	
}
