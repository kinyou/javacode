package generic;


import java.util.*;

/**
 * Created by maogou on 2017/5/7.
 * 1.集合中使用泛型
 * 2.自定义泛型类, 泛型接口, 泛型方法
 */
public class GenericList {
    public int age;
    public static void main(String[] args){
        //1.集合中使用泛型
        test1();
    }

    public static void test2(){

    }


    public static void test1(){
        //泛型的定义格式如下
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bbb");
        list.add("cccc");
        System.out.println(list);
        for (String str : list){
            System.out.println(str + " lengght = " + str.length());
        }

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(0,"乔峰");
        map.put(1,"段誉");
        map.put(2,"鸠摩智");
        System.out.println(map);

        Set<Map.Entry<Integer,String>> set =   map.entrySet();
        System.out.println(set);

        for (Map.Entry<Integer,String> entry : set){
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }

        System.out.println("集合中的泛型使用完毕--------------------");
    }
}
