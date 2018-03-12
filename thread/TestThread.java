package thread;

/**
 * Created by maogou on 2017/5/14.
 */
public class TestThread {
    public static void main(String[] args){
        //3.创建线程
        SubThread subThread = new SubThread();
        SubThread subThread1 = new SubThread();
        //4.启动线程,并调用当前线程的run方法
        subThread.start();
        subThread1.start();
        //5.一个线程只能执行一次start的
        //subThread.start();
        //6.不能直接通过subThread.run()调用执行线程,必须调用start的方法
        //subThread.run();
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

//1.创建一个类继承Thread类
class SubThread extends Thread{
    //2.重写Thread类的run方法,方法内实现子类要完成的逻辑功能
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
