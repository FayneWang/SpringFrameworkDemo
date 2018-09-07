package com.fayne.demo.java.sync;

public class Monitor extends Thread{

    static String a = new String();
    static String b = new String();

    static class Signal1 extends Thread{

        @Override
        public void run() {

            synchronized (a) {
                    while (true){
                        System.out.println("1");
                    }
            }
        }
    }



    static class Signal2 extends Thread{

        @Override
        public void run() {
            synchronized (b) {
                    while (true){
                        System.out.println("2");
                    }
            }
        }
    }


    static public void main(String argv[]){

        Signal1 signal1 = new Signal1();
        Signal2 signal2 = new Signal2();
        Signal2 signal3 = new Signal2();
        signal1.start();
        signal2.start();



        try {

            Thread.sleep(1000);
            while (true){
                System.out.println("main");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
