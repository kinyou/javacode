package cnext;

/**
 * Created by maogou on 2017/3/22.
 */
public class StringCompareTest {
    public static void main(String[] args){
        String s1 = "疯狂java";
        String s2 = "疯狂";
        String s3 = "java";
        String s4 = "疯狂" + "java";
        String s5 = "疯" + "狂" + "java";
        //上面的情况都是在编译的时候已经确定下来了, 所有他们公用一个字符串
        String s6 = s2 + s3;//不能在编译的时候确定下来
        String s7 = new String("疯狂java");//运行时才确定下来
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
    }
}
