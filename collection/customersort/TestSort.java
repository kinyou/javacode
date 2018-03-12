package collection.customersort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by maogou on 2017/5/6.
 */
public class TestSort {
    public static void main(String [] args){
        EmployeeOne e1 = new EmployeeOne("刘德华",65,new MyDate(1965,5,23));
        EmployeeOne e2 = new EmployeeOne("张学友",57,new MyDate(1967,6,3));
        EmployeeOne e3 = new EmployeeOne("郭富城",55,new MyDate(1925,12,9));
        EmployeeOne e4 = new EmployeeOne("黎明",45,new MyDate(1985,9,11));
        EmployeeOne e5 = new EmployeeOne("王保帅",29,new MyDate(1987,10,21));

        Set set = new TreeSet();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------");
        customer();
    }

    /*
    使用自定义比对规则
     */
    public static void customer(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof EmployTwo && o2 instanceof EmployTwo){
                    EmployTwo e1 = (EmployTwo)o1;
                    EmployTwo e2 = (EmployTwo)o2;
                    MyDate d1 = e1.getBirthday();
                    MyDate d2 = e2.getBirthday();

                    if (d1.getYear() != d2.getYear()){
                        return d1.getYear() - d2.getYear();
                    } else{
                        if (d1.getMonth() != d2.getMonth()){
                            return d1.getMonth() - d2.getMonth();
                        } else {
                            return d1.getDay() - d1.getDay();
                        }
                    }
                }
                return 0;
            }
        };
        
        EmployTwo e1 = new EmployTwo("刘德华",65,new MyDate(1965,5,23));
        EmployTwo e2 = new EmployTwo("张学友",57,new MyDate(1967,6,3));
        EmployTwo e3 = new EmployTwo("郭富城",55,new MyDate(1925,12,9));
        EmployTwo e4 = new EmployTwo("黎明",45,new MyDate(1985,9,11));
        EmployTwo e5 = new EmployTwo("王保帅",29,new MyDate(1987,10,21));

        Set set = new TreeSet(comparator);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for (Object employTwo : set) {
            System.out.println(employTwo);
        }


    }
}
