package cnext;

/**
 * Created by maogou on 2017/3/22.
 */
class Apple{
    private String color;
    private double weight;
    public Apple(){}
    public Apple(String color,double weight){
        this.color = color;
        this.weight = weight;
    }
    public String toString(){
        return this.color + this.weight;
    }
}
public class ToStringTest {
    public static void main(String[] args){
        Apple apple = new Apple("蓝色",34.6);
        System.out.println(apple.toString());
    }
}
