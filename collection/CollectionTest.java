package collection;

import java.util.*;

/**
 * Created by maogou on 2017/4/5.
 */
public class CollectionTest {
    public static void main(String[] args){
        Collection collection = new ArrayList();
        //1.size()返回集合的大小
        System.out.println(collection.size());
        //2.add(Object obj)向集合中添加对象
        collection.add(123);
        collection.add("wangxingyuan");
        collection.add(new Date());
        System.out.println(collection.size());
        //3.addAll(collection col)将集合col所有对象添加到另外一个集合中去
        Collection collection1 = Arrays.asList(1,2,3);
        collection.addAll(collection1);
        System.out.println(collection.size());
        //4.isEmpty()判断集合是否为空
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        //5.clear()清空集合
        //collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        //6.contains(Object obj)判断集合中是否包含某个对象,如果是自定义的类的话, 一定要重新equals方法
        Collection collection2 = new ArrayList();
        collection2.add(1);
        collection2.add(2);
        collection2.add(3);
        System.out.println(collection2.contains(1));
        //7.containsAll(collection col)判断集合中是否全部子集合对象
        System.out.println("collection==" + collection);
        System.out.println("collection2==" + collection2);
        System.out.println(collection.containsAll(collection2));
        //8.retainAll(collection col) 取两个集合的交集,并修改了collection
        System.out.println(collection.retainAll(collection2));
        System.out.println(collection);
        //9.remove(Object obj)删除集合中的元素
        System.out.println("collection2==" + collection2);
        System.out.println(collection2.remove(2));
        System.out.println("collection2==" + collection2);
        //10.removeAll(Collecion col)删除collection3中包含collection的对象,改变collection3
        Collection collection3 = new ArrayList();
        collection3.add(1);
        collection3.add(2);
        collection3.add(3);
        collection3.add(4);
        Collection collection4 = new ArrayList();
        collection4.add(2);
        collection4.add(3);
        collection4.add(5);
        collection4.add(5);
        System.out.println("-----------------------------------");
        System.out.println(collection3.removeAll(collection4));
        System.out.println("collection3=" + collection3);
        System.out.println("collection4=" + collection4);
        //11.equals(collection col)判断两个集合是否相等
        System.out.println(collection3.equals(collection4));
        //12.hashCode()计算集合的hash值
        System.out.println(collection3.hashCode());
        //13.toArray()将集合转换为数组
        Object[] obj = collection4.toArray();
        for (int i=0;i<obj.length;i++){
            System.out.print(obj[i]);
        }
        //把数组转换为集合Arrays.asList(obj)
        Collection collection5 = Arrays.asList(obj);
        System.out.print(collection5);
        //14.iterator()迭代集合
        Iterator iterator = collection5.iterator();
        //hasNext判断是否有下一个对象
        while (iterator.hasNext()){
            //next方法返回当前对象
            System.out.println(iterator.next());
        }

    }
}
