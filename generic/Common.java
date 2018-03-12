package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maogou on 2017/5/10.
 */
public class Common {

    public void test(List<Object> list){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Common common = new Common();
        //编译错误,说明List<String> 不是 List<Object>的子类
        //common.test(list);

        List<String> list1 = new ArrayList<>();
        list1 = list;
        System.out.println(list1);
        list.add("d");
        System.out.println(list1);

    }
}
