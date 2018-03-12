/**
 * Created by maogou on 2017/3/20.
 * 尽量不要在父类的构造方法中调用子类重写的方法
 */
class Base {
    public Base(){
        System.out.println("子类或者我自己被实例化了");

        //test();
    }
    public void test(){
        System.out.println("被之类重写的方法");
    }
}
public class Sub extends Base{
    private String name = "good";
    public void test(){
        System.out.println("子类复写父类的方法, 其name字符串的长度是" + name.length());
    }
    public static void main(String[] args){
        Sub s = new Sub();
    }
}

