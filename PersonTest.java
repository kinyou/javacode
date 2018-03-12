/**
 * Created by maogou on 2017/3/15.
 * java的实例变量可以访问类变量, 但是不建议这样做
 */
class Person{
    //定义一个实例变量
    public String name;
    //定义一个类变量
    public static  int eyeNum;
}
public class PersonTest {
    public static void main(String[] args){
        //第一次主动是用Person类,该类自动初始化,则eyeNum开始起作用
        System.out.println(Person.eyeNum);
        //创建Person类
        Person p = new Person();
        //通过实例来调用类成员变量
        System.out.println("p.name=" + p.name + " p.eyeNum=" + p.eyeNum);
        //为p.name 赋值
        p.name = "孙悟空";
        p.eyeNum = 23;
        System.out.println("p.name=" + p.name + " p.eyeNum=" + p.eyeNum);
        //输出类成员变量
        System.out.println(Person.eyeNum);

        //创建另外一个person实例
        Person p2 = new Person();
        System.out.println(p2.eyeNum);
    }
}
