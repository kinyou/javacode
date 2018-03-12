/**
 * Created by maogou on 2017/3/15.
 * 可变参数的...
 * 一个方法最多只能有一个可变参数,而且这个可变参数必须位于最后
 */
public class Varargs {
    public static void test(int a,String... books){
        //books当成数组处理
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args){
        Varargs.test(3,"php","java","ruby","perl");
    }
}
