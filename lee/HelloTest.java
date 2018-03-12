package lee;

import lee.sub.Apple;

/**
 * Created by maogou on 2017/3/17.
 * 包名一般是小写,一般用公司域名倒写
 */
public class HelloTest {
    public static void main(String[] args){
        //同一个包下面类可以自由访问
        Hello hello = new Hello();
        System.out.println(hello.toString());
        Apple apple = new Apple();
        System.out.println(apple.toString());
    }
}
