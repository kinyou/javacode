/**
 * Created by maogou on 2017/3/20.
 */
class Animal{
    private void beat(){
        System.out.println("心脏在跳动");
    }
    public void breath(){
        this.beat();
        System.out.println("吸一口气,吐一口气,呼吸中.....");
    }
}
class Bird{
    //将原来父类组合到原来的子类,作为子类的一部分
    private Animal a;
    public Bird(Animal a){
        this.a = a;
    }
    public void breath(){
        a.breath();
    }
    public void fly(){
        System.out.println("飞起来");
    }
}
public class CompositeTest {
    public static void main(String[] args){
        Bird bird = new Bird(new Animal());
        bird.breath();
        bird.fly();
    }
}
