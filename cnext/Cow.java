package cnext;

/**
 * Created by maogou on 2017/3/27.
 */
public class Cow {
    private double weight;
    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }
    //定义一个非静态的内部类
    private class CowLeg{
        //非静态类里面的两个实例变量
        public double weight = 432.87;
        private double length;
        private String color;
        //非静态内部类里面的两个构造器
        public CowLeg(){}
        public CowLeg(double length,String color){
            this.length = length;
            this.color = color;
        }
        //非静态内部类的实例方法
        public void info(){
            System.out.println("color=" + this.color + " length=" + this.length);
            //直接方法外部类的private修饰的成员变量
            System.out.println(weight);
        }
    }

    public void test(){
        CowLeg cowLeg = new CowLeg(1.12,"黑白直接");
        cowLeg.info();
    }

    public static void main(String[] args){
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
