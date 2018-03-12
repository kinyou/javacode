package cnext;

/**
 * Created by maogou on 2017/3/23.
 */
public class NullAccessStatic {
    public static String name = "xingmaogou";
    public int  age = 18;
    public static void test(){
        System.out.println("static method");
    }
    public static void main(String[] args){
        NullAccessStatic nullAccessStatic = null;
        nullAccessStatic.test();
        System.out.println(nullAccessStatic.name);
        //System.out.println(nullAccessStatic.age);
    }
}
