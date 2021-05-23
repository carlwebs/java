
public class Hello {
	public Hello(String name) {
		this.name = name;
	}
	int age = 12;
	String name = "Jack";
	void study() {
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		Hello hello = new Hello("xiaoming");
		hello.study();  //xiaoming
		Com com = new Com();
		System.out.println(com.nameString);
	}
}
class Com {
	String nameString = "Com类";
	
}
