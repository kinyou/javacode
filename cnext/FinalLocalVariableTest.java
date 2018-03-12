package cnext;

/**
 * Created by maogou on 2017/3/23.
 */
public class FinalLocalVariableTest {
    public void test(final int a){
        //a = 8;
        //不能对final修饰的形参赋值,因为在调用改方法时,有系统传入参数时已经完成了初始化,如果在赋值就相当于
        //第二次赋值
    }
    public static void main(String[] args){
        final String str = "strsss";
        final double d;
        d = 6.76543;
        //只能进行一次赋值
        //d = 7.432;
        System.out.println(d);
    }
}
