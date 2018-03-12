package collection;

import java.util.*;

/**
 * Created by maogou on 2017/5/6.
 * 存储无序元素, 不能重复,如果要添加元素必须重写元素的equals和hashCode方法
 * 当向set中添加对象时,首先调用此对象所在类的hashCode()方法, 计算此对象的哈希值,此
 * 哈希值决定了此对象在set中的存储位置,如此位置之前没有存储对象,则这个对象直接存储在此位置
 * 若此位置已有对象存储,再通过equals()比较这两个对象是否相同,如果相同,后一个对象就不能再添加进来
 * Set
 *      HashSet(主要实现类,一般都用这个)
 *      LinkedHashSet
 *      TreeSet
 */
public class TestSet {
    public static void main(String[] args){
        Set set = new HashSet();
        set.add(12);
        set.add("AA");
        set.add("BB");
        set.add(null);//可以添加null
        set.add(89.43);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------");
        TestSet testSet = new TestSet();
        testSet.testLinkedHashSet();
        testSet.testTreeSet();
        testSet.customerSetTreeSort();
    }

    /*
    LinkedHashSet:可以保证在循环遍历的时候, 可以按照当时添加进去的顺序, 顺序输出
     */
    public  void testLinkedHashSet(){
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(12);
        linkedHashSet.add("cc");
        linkedHashSet.add("dd");
        linkedHashSet.add(null);
        linkedHashSet.add(67.432);
        System.out.println(linkedHashSet);
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /*
        1.向treeSet添加的元素必须是同一个类的才可以
        2.会按照从小到大的顺序输出(自然排序)
        3.当向treeSet中添加自定义对象的时候,可以用自然排序或者自定义自然排序
            自定义排序:要求自定义对象必须实现接口Comparable的compareTo方法,如果按照第一个属性两者相同的话,72行
            那么就添加不加到setTree集合中去了, 这个时候可以在用第二个属性继续比较
        4.定制排序适用的情况是在:如果自己么有权限修改某个类,的时候用, 如果能改原来的类的话, 就用自然排序即可
        5.同时实现 equals,hashCode, compareTo方法,如果添加自定义元素的时候.
     */
    public void testTreeSet(){
        Set treeSet = new TreeSet();
        treeSet.add(12);
        //treeSet.add("cc");
        treeSet.add(9);
        treeSet.add(0);
        treeSet.add(10);
        System.out.println(treeSet);
        System.out.println("----------------------------");
        Set set = new TreeSet();
        set.add(new Person(9,"xingyuan"));
        set.add(new Person(89,"maogou"));
        set.add(new Person(89,"sanmao"));//如果按照age排序的话, 这个不会添加进去
        set.add(new Person(12,"gaodan"));


        System.out.println(set);
    }

    /*
       自定义的排序使用Comparator
     */

    public void customerSetTreeSort(){
        //1.要创建一个Comparator实例
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer)o1;
                    Customer c2 = (Customer)o2;
                    int result = c1.getAge() - c2.getAge();

                    if (result == 0){
                        return c1.getName().compareTo(c2.getName());
                    }
                    return result;
                }
                return 0;
            }
        };

        //2.创建自己的treeSet集合
        Set set = new TreeSet(comparator);

        set.add(new Customer(12,"aa"));
        set.add(new Customer(11,"cc"));
        set.add(new Customer(11,"gg"));
        set.add(new Customer(9,"ff"));
        set.add(new Customer(98,"bb"));

        System.out.println(set);
    }
}
