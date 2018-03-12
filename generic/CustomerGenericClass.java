package generic;

/**
 * Created by maogou on 2017/5/10.
 *
 */

//自定义一个泛型类
public class CustomerGenericClass<T> {
    //使用T类型形参定义实例变量
    private T info;
    //构造方法
    public CustomerGenericClass(){
        System.out.println("实例化的时候没有参数哦");
    }
    //下面使用T类型的形参来定义构造器
    public CustomerGenericClass(T info){
        System.out.println("实例化的时候有参数哦");
        this.info = info;
    }
    //获取info信息
    public T getInfo(){
        System.out.println("getXXX属性的时候会调用我");
        return this.info;
    }

    //设置info
    public void setInfo(T info){
        this.info = info;
    }

    public static void main(String[] args){
        //传递给T形参的是String类型,所以构造器参数只能是string类型的
        CustomerGenericClass<String> customerGenericClass = new CustomerGenericClass<String>("锤子手机");
        System.out.println(customerGenericClass.getInfo());
        CustomerGenericClass<Double> customerGenericClass1 = new CustomerGenericClass<Double>(5322.65432);
        System.out.println(customerGenericClass1.info);

    }
}
