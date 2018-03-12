package lee.sub;

/**
 * Created by maogou on 2017/3/18.
 */
class Creature{
    public Creature(){
        System.out.println("Creature 无参数的构造器");
    }
}
class Animal extends Creature{
    public Animal(String name){
        System.out.println("一个参数的: " + name);
    }
    public Animal(String name,int age){
        System.out.println("name:" + name + " age"+age);
    }
}
public class Wolf extends Animal{
    public Wolf(){
        super("灰太狼",43);
    }

    public static void main(String[] args){
        Wolf wolf = new Wolf();
    }
}
