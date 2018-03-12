/**
 * Created by maogou on 2017/3/21.
 */
public class InstanceInitTest {
    public int a;
    {
        a = 6;
    }
    {
        System.out.println(a);
        System.out.println("aaa");
    }
    public static void main(String[] args){
        new InstanceInitTest();
        System.out.println("gogogo");
    }
}
