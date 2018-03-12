package lee.sub;

/**
 * Created by maogou on 2017/3/18.
 */
class Parent{
    public String tag = "疯狂java讲义";
}
class Derived extends Parent{
    private String tag = "轻量级java ee开发";
}
public class Hide {
    public static void main(String[] args){
        Derived derived = new Derived();
        //将derived显示转为父类的tag,因为自己的属性是私有的不能访问
        System.out.println(((Parent)derived).tag);
    }
}
