package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by maogou on 2017/5/5.
 * List 指定的集合相当于动态数组,有序的可重复的
 * 集合:
 *      Collection接口
 *          list--->有序的,可重复的
 *              --->ArrayList(主要的实现类),
 *              --->LinkedList(频繁的插入和删除使用)
 *              --->Vector(古老的实现类, 线程安全,一般不用)
 *          set---->无序的,不可重复
 *              --->HashSet
 *              --->LinkedList(可以按照当时添加顺序, 输出)
 *              --->TreeSet
 *      Map接口
 *          HashMap
 *          LinkedHashMap
 *          TreeMap
 *          HashTable
 *
 * 注意点:添加到list中的元素,必须重新元素的equals()方法
 */
public class TestList {
    public static void main(String[] args){
        String GG = "GG";
        List list = new ArrayList();
        list.add(1);
        list.add(GG);
        list.add("wang xing yuan");
        list.add(GG);
        list.add(654.23);
        //1.在指定位置添加单个值
        list.add(1,"我是在指定位置添加");

        Collection collection = new ArrayList();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        //2.在指定位置添加多个
        list.addAll(2,collection);

        List list1 = new ArrayList();
        list1.add('e');
        list1.add('d');
        list1.add('f');
        //2.在指定位置添加多个
        list.addAll(3,list1);
        //3.移除指定位置的元素并返回
        Object obj = list.remove(1);
        //4.更改指定位置的值
        list.set(0,"change index 0");
        System.out.println("----------------------------------");
        System.out.println(list);
        //5.indexOf(Object obj)返回对象首次出现的位置,没有返回-1
        System.out.println(list.indexOf("wang xing yuan"));
        System.out.println(list.indexOf("GG"));
        //6.lastIndexOf(Object obj)返回对象最后一次出现的位置, 没有返回-1
        System.out.println(list.lastIndexOf("GG"));
        //7.subList(start,end)截取集合的部分元素,包含起始位置和终止位置
        List list2 = list.subList(2,6);
        System.out.println(list2);
        //8.循环遍历list
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------------------------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

