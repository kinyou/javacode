/**
 * Created by maogou on 2017/3/15.
 */
class DataWarp{
    int a;
    int b;
}
public class ReferenceTransferTest {

    public static void swap(DataWarp dw){
        int tmp;
        tmp = dw.a;
        dw.a = dw.b;
        dw.b =tmp;
        System.out.println("dw.a=" + dw.a + " dw.b=" + dw.b);
    }
    public static void main(String[] args){
        DataWarp dw = new DataWarp();
        dw.a = 6;
        dw.b = 9;
        ReferenceTransferTest.swap(dw);
        System.out.println("dw.a = " + dw.a + " dw.b=" + dw.b);
    }
}
