import java.util.Arrays;

/**
 * Created by maogou on 2017/3/15.
 */
public class OverloadVarargs {
    public void test(String book){
        System.out.println(book);
    }

    public void test(String... book){
        System.out.println(Arrays.toString(book));
    }

    public static void main(String[] args){
        OverloadVarargs ov = new OverloadVarargs();
        ov.test("疯狂java讲义");
        ov.test("疯狂java讲义","疯狂php讲义","疯狂ruby讲义");
        ov.test(new String[]{"java","php"});
    }
}
