package com.ivg;

/**
 * @author: lj
 * @description:
 * @date: 15:46 2017/10/26
 */
public class Mythread extends Thread{
    private int count = 5;
    public synchronized void run (){
        count--;
        System.out.println(this.currentThread().getName() + "count = " + count);
    }

    public static  void main (String[] args){

        Mythread myThread = new Mythread();
        Thread t1 = new Thread(myThread , "t1");
        Thread t2 = new Thread(myThread , "t2");
        Thread t3 = new Thread(myThread , "t3");
        Thread t4 = new Thread(myThread , "t4");
        Thread t5 = new Thread(myThread , "t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }


}
