/**
 * Created by maogou on 2017/3/17.
 */
public class DogTest {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("哈奇士");
        String name = dog.getName();
        System.out.println(name);

        dog.setAge(1000);
    }
}
