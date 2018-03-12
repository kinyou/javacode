package lee.sub;

/**
 * Created by maogou on 2017/3/17.
 * super也不能出现在静态方法中
 */
public class Ostrich extends Bird{
    public void fly(){
        //子类调用父类的同名方法
        super.fly();
        System.out.println("我不想飞");
    }
    public static void main(String[] args){
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
    }
}
