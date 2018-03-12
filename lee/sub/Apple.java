package lee.sub;

/**
 * Created by maogou on 2017/3/17.
 */
public class Apple extends Fruit{
    public static String name = "Apple";

    public static void main(String[] args) {
        System.out.println("lee.sub 包下面的类");
        Apple apple = new Apple();
        apple.weight = 6.5;
        apple.info();
    }
}
