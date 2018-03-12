/**
 * Created by maogou on 2017/3/22.
 */
public class StaticInitTest {
    //先执行静态初始化块,将a静态成员变量值为6

    //再将a静态变量赋值为9

    static  int a = 9;
    static {
        a = 6;
    }
    public static void main(String[] args){
        System.out.println(StaticInitTest.a);
    }
}
