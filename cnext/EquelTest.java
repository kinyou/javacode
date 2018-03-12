package cnext;

/**
 * Created by maogou on 2017/3/22.
 */
public class EquelTest {
    public static void main(String[] args){
        int it = 65;
        float fl = 65.0f;
        System.out.println(it == fl);
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
