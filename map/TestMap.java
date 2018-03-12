package map;

import java.util.*;

/**
 * Created by maogou on 2017/5/6.
 * Map接口,key-value形式, key是用set保存的,一般用String类型的作为键
 *      HashMap(主要实现类)
 *      LinkedHashMap(循环遍历的时候也是按照当时添加进去的元素输出)
 *      TreeMap(按照添加的key排序,要求key必须是同一个类的对象,排序和treeSet一样也有自然排序和定制排序)
 *      HashTable(不允许使用null作为key和value,太古老基本不用了)
 *          Properties(常用来处理属性文件,键和值都是String)
 */
public class TestMap {
    public static void main(String[] args){
        Map map = new HashMap();
        //1.向集合中添加一个元素
        map.put("name","xingmaogou");
        map.put("age",12);
        map.put("email","kinyou_xy@126.com");
        map.put("sex","男");
        map.put(23,788);
        //2.根据key删除集合map中的一个值
        map.remove(23);
        System.out.println(map);
        //3.根据key获取集合中的一个值
        System.out.println(map.get("email"));
        //4.判断key是否存在map中
        System.out.println(map.containsKey("age"));
        //5.判断value是否map中
        System.out.println(map.containsValue("男"));
        //6.返回map的大小
        System.out.println(map.size());
        //7.判断map是否为空
        System.out.println(map.isEmpty());
        //8.判断map是否和另外一个map相等
        System.out.println(map.equals(new HashMap()));
        //9.返回所有valus的collection
        System.out.println(map.values());
        //10.返回所有的key的set
        System.out.println(map.keySet());

        //这里调用另外一个方法
        System.out.println("---------------------");
        foreach();
        //11.清空map
        map.clear();
        System.out.println(map);
    }

    /*
      如何变量map
     */
    public static void foreach(){
        Map map = new HashMap();
        map.put("name","xingmaogou");
        map.put("age",12);
        map.put("email","kinyou_xy@126.com");
        map.put("sex","男");

        //1.如何变量key
        Set set = map.keySet();
        for (Object key : set) {
            System.out.println(key);
        }

        System.out.println("---------------------");

        //2.如何变量valus
        Collection collection = map.values();
        for (Object col : collection) {
            System.out.println(col);
        }

        System.out.println("---------------------");
        Set set1 = map.keySet();
        for (Object key : set1) {
            System.out.println(key + "--->" + map.get(key));
        }

        //创建一个LinkedHashMap
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("age" , 12);
        linkedHashMap.put("name" , "wangxingyuan");

        System.out.println("LinkedHashMap---------------------");
        Set set2 = linkedHashMap.keySet();
        for (Object key : set2) {
            System.out.println(key + "--->" + linkedHashMap.get(key));
        }

    }
}
