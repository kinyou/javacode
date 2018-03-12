package generic;

import java.util.*;

/**
 * Created by maogou on 2017/5/9.
 */
public class ListErr {
    public static void main(String[] args){
        right();
        rightMap();
    }

    public static void rightMap(){
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("php");
        list.add("javascript");
        List<String> list1 = new ArrayList<String>();
        list1.add("初级工程师");
        list1.add("中级工程师");
        list1.add("高级工程师");
        HashMap<String,List<String>> hashMap = new HashMap<String,List<String>>();
        hashMap.put("web",list);
        hashMap.put("level",list1);
        System.out.println(hashMap);
        System.out.println("------------------------------");
        Collection<List<String>> lists = hashMap.values();
        System.out.println(lists);
        System.out.println("------------------------------");
        for (List<String> lt : lists){
            for (String str : lt){
                System.out.println(str);
            }
            System.out.println("------------------------------");
        }
        System.out.println("------------------------------");
        Set<String> set = hashMap.keySet();
        System.out.println(set);






    }

    public static void right(){
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bbb");
        list.add("cccc");

        for (String str : list){
            System.out.println(str.length());
        }
    }

    public static void err(){
        List strList = new ArrayList();
        strList.add("疯狂java讲义");
        strList.add("疯狂ios讲义");

        strList.add(4);
        strList.forEach(str->System.out.println(((String)str).length()));
    }
}
