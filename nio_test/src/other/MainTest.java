package other;

import java.util.Scanner;

public class MainTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) { // scanner.hasNext()是判断用户是否输入了值
			if (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				System.out.println("用户输入了：" + i);
			}
			break;
		}
		scanner.close();
	}
}
