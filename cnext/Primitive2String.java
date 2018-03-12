package cnext;

/**
 * Created by maogou on 2017/3/22.
 */
public class Primitive2String {
    public static void main(String[] args){
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        String floatStr = "4.98678";
        float ft1 = Float.parseFloat(floatStr);
        float ft2 = new Float(floatStr);
        System.out.println(ft2);
        //把一个float变量转换成String变量
        String ftStr = String.valueOf(2.345f);
        System.out.println(ftStr);
        String boolStr = String.valueOf(true);
        System.out.println(boolStr.toUpperCase());
    }
}
