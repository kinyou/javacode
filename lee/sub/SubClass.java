package lee.sub;

/**
 * Created by maogou on 2017/3/18.
 */
public class SubClass extends BaseClass{
    public int a = 7;
    public void accessOwner(){
        System.out.println(a);
    }
    public void accessBase(){
        //访问从父类继承过来的a实例属性
        System.out.println(super.a);
    }
    public static void main(String[] args){
        SubClass subClass = new SubClass();
        subClass.accessBase();
        subClass.accessOwner();
    }
}
