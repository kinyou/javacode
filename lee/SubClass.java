package lee;

import lee.sub.Sub;

/**
 * Created by maogou on 2017/3/18.
 * 引用变量在编译阶段只能调用其编译时类型所具有的方法, 但是运行时候,则执行他运行时类型的方法
 * .因此编写java代码时,引用变量只能调用(申明该变量时)所用类里面包含的方法
 * 例如,Object p = new Person(); 定义一个变量p,则这个p只能调用Object类的方法,而不能调用Person类里面定义的方法
 */
class BaseClass {
    public int book = 6;
    public void base(){
        System.out.println("父类的普通方法");
    }

    public void test(){
        System.out.println("父类的被覆盖的方法");
    }
}
public class SubClass extends BaseClass{
    public String book = "轻量级java ee开发";
    public String name = "xingmaogou";
    public void test(){
        System.out.println("子类覆盖类的test方法");
    }
    public void sub(){
        System.out.println("子类的普通方法");
    }
    public static void main(String[] args){
        //下面编译时类型和运行时类型完全一样,所以不存在多态的现象
        BaseClass baseClass =  new BaseClass();
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test();
        SubClass subClass = new SubClass();
        System.out.println(subClass.book);
        subClass.base();
        subClass.test();
        //下面编译时和运行时的类型不一样,会参数多态
        //编译变量为BaseClass 运行时变量为SubClass
        BaseClass bc1 = new SubClass();
        bc1.base();
        bc1.test();
        //通过引用变量来访问其包含的实例变量时,系统总是试图访问它编译时类型所定义的成员变量,而不是它运行时所定义的成员变量
        System.out.println(bc1.book);
        //不能访问因为编译时变量没有这样的属性name
        //System.out.println(bc1.name);
        //编译时类型的变量没有sub方法所有会报错
        //bc1.sub();
    }

}
