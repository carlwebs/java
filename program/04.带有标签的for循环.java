
public class Hello {
	public static void main(String[] args) {
		outer: for(int i=0;i<3;i++) {
			for (int j = 0; j < 2; j++) {
				if(i == 1 && j == 1) {
					continue outer; //带有标签的continue，可以直接跳出外层循环
				}
			}
			System.out.println(i);  // 0 2
		}
	}
}
