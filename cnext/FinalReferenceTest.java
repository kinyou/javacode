package cnext;

import java.util.Arrays;

/**
 * Created by maogou on 2017/3/23.
 * final修饰的引用变量, 只能保证引用变量不会被再次赋值
 * 但是其对于的实例引用的对象的内容:
 */
class Person{
    public int age;
    public Person(){}
    public Person(int age){
        this.age =age;
    }
}
public class FinalReferenceTest {
    public static void main(String[] args){
        final int[] iArr = {1,4,6,7};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = 543;
        System.out.println(Arrays.toString(iArr));
        //final修饰的iArr修饰的引用变量不能再次改变值
        //iArr = null;会报错
        final Person p = new Person(45);
        System.out.println(p.age);
        p.age = 543;
        System.out.println(p.age);
    }
}
