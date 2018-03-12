package lee.sub;

/**
 * Created by maogou on 2017/3/17.
 * 构造器没有返回值
 * 构造器可以N多个
 */
public class ConstructorTest {
    public String name;
    public int count;

    //构造器
    public ConstructorTest(String name, int count){
        this.count = count;
        this.name = name;
    }
    public static void main(String[] args){
        ConstructorTest tc =  new ConstructorTest("xingmaogou",28);

        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
