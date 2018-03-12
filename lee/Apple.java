package lee;

/**
 * Created by maogou on 2017/3/17.
 */
public class Apple {
    public String name;
    public String color;
    public double weight;

    public Apple(){
        //默认的构造器
    }
    //两个参数的构造器
    public Apple(String name , String color){
        this.name =name;
        this.color = color;
    }
    //三个参数的构造器
    public Apple(String name,String color,double weight){
        //应用第二构造器
        this(name,color);//这种写法只能在构造器中使用, 而且必须出现在第一行
        this.weight = weight;
    }

    public static void main(String[] args){
        Apple apple = new Apple("maogou","蓝色",145.9);
        System.out.println(apple.name);
        System.out.println(apple.color);
        System.out.println(apple.weight);
    }
}
