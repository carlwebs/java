public class Hello {
	static {
		System.out.println("static静态块先执行.");
	}
	public static void main(String[] args) {
		System.out.println("main方法");
	}
}