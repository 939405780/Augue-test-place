package other;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) { // scanner.hasNext()���ж��û��Ƿ�������ֵ
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("�û������ˣ�" + i);
            }
            break;
        }
        scanner.close();
    }
}
