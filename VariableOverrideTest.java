/**
 * Created by maogou on 2017/3/16.
 * 方法中的局部变量如何和类的实例变量或者
 * 类变量同名会覆盖类的实例变量和类变量
 */
public class VariableOverrideTest {
    //定义一个实例变量
    public String name = "wangxingyuan";
    //定义一个类变量
    public static double price = 73.0;

    public static void main(String[] args){
        //定义方法的局部变量
        double price = 67.7;
        //输出67.7, 覆盖了实例变量price
        System.out.println(price);
        System.out.println(VariableOverrideTest.price);

        new VariableOverrideTest().info();
    }

    public void info(){
        String name = "maogou";
        System.out.println(name);
        System.out.println(this.name);
    }
}
