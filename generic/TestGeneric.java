package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maogou on 2017/5/8.
 */
public class TestGeneric {
    public static void main(String[] args){
        //当实例化泛型类对象时,指明泛型的类型
        //指明以后, 对应的类中所有使用泛型的位置,都为实例化指定的类型,如果么有使用的默认是Object类型
        Order<Boolean> order = new Order<Boolean>();
        order.setT(true);
        System.out.println(order.getT());
        order.add();
        List<Boolean> list = order.list;
        System.out.println(list);

        //泛型方法的使用
        Order<Integer> order1 = new Order<Integer>();
        String str = order1.getE("字符串类型的哦");
        Integer num = order1.getE(123);
        System.out.println(str + num);

        Integer[] arr = new Integer[]{1,5,7};
        List<Integer> list1 = new ArrayList<Integer>();

        List<Integer> list2 =order1.fromArrayToCollection(arr,list1);

        System.out.println(list2);
    }
}
