package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by maogou on 2017/5/5.
 * 集合的循环
 */
public class TestIterator {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add("xingmaogou");
        collection.add("xx");
        collection.add(43.97789);

        //第一种方法
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------");
        //第二种方法,增强for循环
        for(Object i:collection){
            System.out.println(i);
        }
    }
}
