
public class Hello {
	public static void main(String[] args) {
		Hello fHello = new Hello();
		fHello.fn();
		System.out.println(fHello.add(1, 2));  //类的实例方法 必须通过类的实例调用
		HelloStatic();  //类的静态方法可以直接调用古
	}
	String name = "jack";
	void fn() {
		System.out.println(this.name);
	}
	int add(int a,int b) {
		return a + b;
	}
	static void HelloStatic() {
		System.out.println("类的静态方法");
	}
}
