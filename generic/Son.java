package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by maogou on 2017/5/10.
 */
public class Son extends CustomerGenericClass<String> {
    //正确重写了父类的方法,返回值
    //要与父类CustomerGenericClass<String>指定的类型完全相同

    public String getInfo(){
        return  "子类" + super.getInfo();
    }
    public Son(){
        super("调用父类的构造方法");
        //super(4534555.64332D);
    }
    //错误的声明
    //public static T errStatic;
    //public static T errMsg(){}
    //static{
      //  T errVar;
    //};

    public static void main(String[] args){
        Son son = new Son();
        System.out.println(son.getInfo());

        List<String> listStr = new ArrayList<String>();
        List<Double> listDble = new ArrayList<Double>();

        //从下面输出可以看到使用泛型后,其实还是共用了一个类
        //所以不能在静态方法, 静态变量, 静态代码块中使用泛型
        //因为静态的东西都是类固有的,所以实例共享的, 所以不能一会是String类型一会是Double类型
        System.out.println(listDble.getClass());
        System.out.println(listStr.getClass());
        System.out.println(listStr.getClass() == listDble.getClass());

        //java中并不存在泛型类型,所以不能对泛型使用instanceof操作
        Collection<Integer> collection = new ArrayList<Integer>();
        System.out.println(collection instanceof ArrayList);
        //错误操作
        //System.out.println(collection instanceof ArrayList<Integer>);
    }
}
