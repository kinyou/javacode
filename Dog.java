/**
 * Created by maogou on 2017/3/17.
 */
/**
 * Created by maogou on 2017/3/17.
 */
public class Dog {
    //使用private修饰实例变量隐藏起来
    private String name ;
    private int age;
    //提供设置实例变量的方法

    public void setAge(int age) {
        //经验age的合法性
        if (age > 100 || age < 0){
            System.out.println("年龄不合法");
            return ;
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name){
        if (name.length() > 6 || name.length() < 2){
            System.out.println("name的长度不合法");
            return ;
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

