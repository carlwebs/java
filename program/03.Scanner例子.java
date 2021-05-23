import java.util.Scanner;


public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入姓名：");
		String name = scanner.nextLine();
		System.out.println("年龄：");
		int age = scanner.nextInt();
		System.out.println(name);
		System.out.println(age);
	}
}
