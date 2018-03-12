package cnext;

/**
 * Created by maogou on 2017/3/23.
 */
class SingLeton {
    //使用一个类变量来缓存曾经创建的实例
    private static SingLeton instance;
    //对构造器使用private修饰,隐藏该构造器
    private SingLeton(){}
    //提供一个静态方法,用于返回Singleton实例
    //该方法可以加入自定义控制,保证只产生一个Singleton对象
    public static SingLeton getInstance(){
        if(SingLeton.instance == null){
            SingLeton.instance = new SingLeton();
        }
        return SingLeton.instance;
    }
}
public class SingLetonTest{
    public static void main(String[] args){
        SingLeton singLeton1 = SingLeton.getInstance();
        SingLeton singLeton2 = SingLeton.getInstance();
        System.out.println(singLeton1.toString());
        System.out.println(singLeton2.toString());

        System.out.println(singLeton1.equals(singLeton2));
        System.out.println(singLeton1 == singLeton2);
    }
}

