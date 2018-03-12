/**
 * Created by maogou on 2017/3/15.
 * 方法重载,方法的参数,调用者,方法名
 */
public class Overload {
    public void test(){
        System.out.println("wu can shu");
    }
    public void test(String name){
        System.out.println("重载test方法" + name);
    }

    public static void main(String[] args){
        Overload ol = new Overload();
        ol.test();
        ol.test("xingyuan");
    }
}
