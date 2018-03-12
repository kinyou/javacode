package annotation;

/**
 * Created by maogou on 2017/5/10.
 * 注解:
 *     1.常用注解
 *          @Override 限定重写父类的方法, 该注解只能用于方法
 *          @Deprecated 表示程序某个元素(类,方法等)已过时
 *          @SupperessWarings 控制编译器你警告
 *     2.如何定义一个注解
 *     3.元注解
 */
public class TestAnnotation {
    public static void main(String[] args){
        Person person = new Student();
        person.walk();
        person.outTime();

        @SuppressWarnings("unused")
        int i = 10;
    }
}

//也可以修饰类
@Deprecated
class Student extends Person{
    @Override
    public  void walk(){
        System.out.println("学生走路");
    }
    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }

}

@CustomerAnnotation(value="gogog")
class Person{
    private String name;
    @Deprecated
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person() {}
    public  void walk(){
        System.out.println("走路");
    }
    public void eat(){
        System.out.println("吃饭");
    }

    @Deprecated
    public void outTime(){
        System.out.println("已过时");
    }
}
