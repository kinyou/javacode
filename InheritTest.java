/**
 * Created by maogou on 2017/3/20.
 */
class Good{
    private void beat(){
        System.out.println("心脏跳动.....");
    }
    public void breath(){
        this.beat();
        System.out.println("吸一口气,吐一口气,呼吸中......");
    }
}
class Monkey extends Good{
    public void fly(){
        System.out.println("我在天空自由的飞翔........");
    }
}
class Wolf extends Good{
    public void run(){
        System.out.println("我再陆地上快速奔跑.......");
    }
}

public class InheritTest {
    public static void main(String[] args){
        Monkey bird = new Monkey();
        bird.breath();
        bird.fly();

        Wolf wolf = new Wolf();
        wolf.breath();
        wolf.run();
    }
}
