/**
 * Created by maogou on 2017/3/21.
 * 静态块 > 初始化 > 构造函数
 * 静态块运行类就会执行
 */
public class Person1 {
    //定义一个初始化块
    {
        int a = 4;
        if (a < 6) {
            System.out.println("Person初始化块,局部变量a的值大于4");
        }
        System.out.println("Person的初始化块");
    }
    //定义第二个初始化块
    {
        System.out.println("Person的第二个初始化块");
    }
    //定义一个静态块
    static{
        System.out.println("我是静态块哦");
    }
    //定义一个无参数的构造器
    public Person1(){
       System.out.println("Person1无参数构造方法");
    }

    public static void main(String[] args){
        new Person1();
    }
}
