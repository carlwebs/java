/**
 * 1.自动类型提升：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
 * byte --> short --> int --> long --> float --> double
 * 
 * 特别的：当byte,char,short三种类型的变量做运算时，结果为int类型
 * 2.强制类型转换：
 * double d = 11.8;
   int e = (int)d;
   System.out.println(e);  //11
 */
package program;
public class HelloWorld {
    public static void main(String[] args) {
        byte a = 1;
        int b = 2;
        int c= a + b;
        System.out.println(c);
        double d = 11.8;
        int e = (int)d;
        System.out.println(e);  //11
    }
}