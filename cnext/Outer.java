package cnext;

/**
 * Created by maogou on 2017/3/27.
 */
public class Outer {
    private int outProp = 9;
    class Inner {
        private int inProp = 5;
        public void accessOuterProp(){
            //非静态内部类可以直接访问外部类的private成员变量
            System.out.println(outProp);
        }
    }
    public void accessInnerProp(){
        //外部类不能直接访问非静态类的内部实例变量
        //System.out.println(inProp); //会报错
        //如需访问内部类的实例变量,必须显式创建内部类对象
        System.out.println(new Inner().inProp);
    }
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.accessInnerProp();
    }

}
