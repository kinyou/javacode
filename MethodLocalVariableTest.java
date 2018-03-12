/**
 * Created by maogou on 2017/3/16.
 */
public class MethodLocalVariableTest {
    public static void main(String[] args){
        //定义一个局部变量a
        int a;
        //局部变量初始化之后才能使用
        //System.out.println(a); 这样会报错
        a = 5;
        System.out.println(a);
    }

}
