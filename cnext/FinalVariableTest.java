package cnext;

/**
 * Created by maogou on 2017/3/23.
 */
public class FinalVariableTest {
    //定义成员变量指定默认值合法
    final public int a = 6;
    final private int num = 134;
    //下面将在构造器或初始化块中分配初始化值
    final public String str;
    final public int c;
    final public static double d;
    //既没有指定默认值,又没有在初始化块,构造器中指定初始化值
    //下面定义的ch实例变量是不合法
    //final public char ch;
    //初始化块,对没有指定默认值的实例变量赋值
    {
        str = "hello";
        //不能为a重新赋值, 因为在定义成员变量已经指定了默认值
        //a = 9;
    }
    //静态初始化块
    static {
        d = 5.786;
    }

    //在构造器中为既没有指定默认值,又没有在初始化块中指定默认值赋值
    public FinalVariableTest(){
        this.c = 89;
        //不能在构造方法中为, 指定默认值或者在初始化块中赋值的的再次赋值
        //str = "dafaf";
    }

    public void changeFinal(){
        //普通方法不能为final修饰的成员变量赋值
        //this.a = 98;
    }
    public static void main(String[] args){
        FinalVariableTest finalVariableTest = new FinalVariableTest();
        System.out.println(finalVariableTest.a);
        System.out.println(finalVariableTest.str);
        System.out.println(finalVariableTest.c);
        System.out.println(FinalVariableTest.d);
        System.out.println(finalVariableTest.num);
    }
}
