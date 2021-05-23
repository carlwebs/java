/**
 * 解决 java “错误：编码GBK 的不可映射字符”
 * 运行是使用javac -encoding UTF-8HelloWorlewww.java
 * 1.java定义变量的格式：  变量类型  变量名 = 变量值
 * 2.java的整型常量默认为int，声明long后面加l或L。
 * 下面两个编译不过，默认整数为int类型。
 * byte a = 1;
 * byte b = a + 2;
 * 自动类型转换指的是容量小的数据类型可以自动转换为容量大的数据类型。
*/ 

package program;
import java.math.*;
public class HelloWorld {
    public static void main(String[] args) {
        byte a = 1;  //byte类型一个子节
        short b = 2;  //short两个子节
        int c = 3;   //int四个子节
        long d = 4l;  //long 8个子节
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        float e = 1.2f;  //float 4个子节  精度7位小数,末尾以f或F结尾。
        double f = 1.23;  //double 8个子节  精度14位小数
        // 小数默认double类型，整数默认int类型
        System.out.println(e);
        System.out.println(f);
        char g = 'a'; //2个子节
        char h = '中'; //2个子节
        System.out.println(g);
        System.out.println(h);
        boolean boo = true; //一位
        // BigDecimal处理大数据，精度不会丢失
        BigDecimal bd = BigDecimal.valueOf(0.3);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);  //0.2
    }
}

