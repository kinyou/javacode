package cnext;

/**
 * Created by maogou on 2017/3/23.
 */
public class FinalErrorTest {
    final int age;
    {
        //不要在初始化块之前调用
        //System.out.println(age);
        age = 8;
        System.out.println(age);
    }
    public static void main(String[] args){
        new FinalErrorTest();
    }
}
