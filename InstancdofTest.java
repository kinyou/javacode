/**
 * Created by maogou on 2017/3/20.
 */
public class InstancdofTest {
    public static void main(String[] args){
        //申明hello时使用Object类,则hello的编译类型是Object
        //Object是所有类的父类,但是hello变量的实际类型是String
        Object hello = "Hello";
        //String 和 Object类存在继承关系, 可以进行instanceof运算,返回true
        System.out.println(hello instanceof Object);
        System.out.println(hello instanceof String);
        System.out.println(hello instanceof  Math);
        System.out.println(hello instanceof Comparable);//Comparable是字符串接口

        String a = "hello";
        System.out.println(a instanceof String);
    }
}
