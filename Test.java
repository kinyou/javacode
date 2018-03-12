/**
 * Created by maogou on 2017/3/22.
 */
class Root {
    static {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通代码块");
    }
    public Root(){
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参初构造方法");
    }
    public Mid(String msg){
        //调用无参数的构造方法
        this();
        System.out.println("Mid的一个参数构造方法" + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态块");
    }
    {
        System.out.println("Leaf的初始化块");
    }
    public Leaf(){
        super("疯狂java讲义");
        System.out.println("执行Leaf的构造器");
    }
}
public class Test {
    public static void main(String[] args){
        new Leaf();
        System.out.println("-------------第二次实例化----------");
        new Leaf();
    }
}
