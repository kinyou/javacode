package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maogou on 2017/5/8.
 * 自定义泛型类
 */
public class Order<T> {
    private String orderName;
    private int orderId;
    //泛型的定义属性
    private T t;
    List<T> list = new ArrayList<T>();

    public void add() {
        list.add(t);
    }

    //泛型方法
    public <E> E getE(E e){
        return e;
    }
    //实现数组到集合的复制
    public <E> List<E> fromArrayToCollection(E[] arr, List<E>list ){
        for(E e : arr){
            list.add(e);
        }

        return list;
    }


    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t = t;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


}
