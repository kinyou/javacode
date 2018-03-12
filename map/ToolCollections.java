package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by maogou on 2017/5/6.
 */
public class ToolCollections {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        //arrayList.add(12);
        arrayList.add("wangxingyuan");
        arrayList.add("houxixi");
        arrayList.add("age");
        arrayList.add("email");

        System.out.println(arrayList);
        //1.翻转集合
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        //2.随机打乱集合
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        //3.对集合进行排序
        Collections.sort(arrayList);
        System.out.println(arrayList);
        //4.swap(List,a_index, int_index )交换
        Collections.swap(arrayList,1,3);
        System.out.println(arrayList);
        //5.将list转换为安全集合
        List list = Collections.synchronizedList(arrayList);

        System.out.println(list);
    }
}
