package file;

import java.io.File;

/**
 * Created by maogou on 2017/5/14.
 */
public class FileTest {
    public static void main(String[] args){
        //1.以当前路径创建一个File对象
        File file = new File(".");
        //2.直接获取文件名,输出一个.
        System.out.println(file.getName());
        //3.获取相对路径的父路径,下面代码输出null
        System.out.println(file.getParent());
        //4.获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //5.获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
        //6.在当前路径下创建一个临时文件
        //File tmpFile = new File.createTempFile("aaa",".txt",file);
        System.out.println(file);
    }
}
