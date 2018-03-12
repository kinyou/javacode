/**
 * Created by maogou on 2017/3/16.
 */
public class BlcokTest {
    public static void main(String[] args){
        {
            //在代码块里面定义个局部变量
            int a;
            //这个变量只有赋值之后才能访问
            a = 37;
            System.out.println(a);
        }
        //在代码块外面a就失效了
        System.out.println("不能在这外面访问代码块里面的a");
    }
}
