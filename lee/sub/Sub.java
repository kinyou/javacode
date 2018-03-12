package lee.sub;

/**
 * Created by maogou on 2017/3/18.
 * 子类继承父类, 实例化子类的时候
 * 都会自动调用父类的构造器
 */
public class Sub extends Base{
    public String color;
    public double size;
    public Sub(String color,double size){
        super(color);//调用父类的构造器方法
        this.size = size;
        this.color = color;
    }


    public static void main(String[] args){
        Sub sub = new Sub("lanse",76.89);
        System.out.println(sub.color);
    }
}
