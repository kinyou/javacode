package lee;

/**
 * Created by maogou on 2017/3/20.
 */
public class ConversionTest {
    public static void main(String[] args){
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
        //试图把一个数值类型的变量转为boolean类型,下面代码会编译错误
        //boolean b = (boolean)in;
        Object obj = "Hellojava";
        //obj变量的编译时类型为Object, Object于String存在继承关系,可以强制转换
        String objStr = (String)obj;
        System.out.println(objStr);
        Object objPri = new Integer(5);
        //objPri变量编译时类型是Object, objPri的运行时类型是Integer
        //因为所有类都继承了Object类
        //String  str = (String)objPri;

        //考虑到进行强制类型时可能出现异常,因此进行类型转换之前应先通过instanceof运算符来判断时候可以成功转换
        if (objPri instanceof String){
            String  str = (String)objPri;
        }
    }
}
