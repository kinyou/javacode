package lee;

//静态导入属性和方法
//import static  lee.sub.StaticTest.name;

import static lee.sub.Apple.name;

/**
 * Created by maogou on 2017/3/17.
 */
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello package");
        System.out.println(name);

    }
}
