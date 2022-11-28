package com.leaning;

import com.leaning.oop.Dog;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {

    //Throwable
    //  Exception - catched
    //    RuntimeException - uncatched
    //  Error - JVM

    public static void main(String[] args) {
       // m1();


        //String s = null;
        //System.out.println(s.length());

        //System.out.println(1/0);

        //rec();

        List<Object> list = new ArrayList<>();
        while(true) {
            list.add(new Object());
        }

        //try with resources
       // try {
            //write to file
        //} finally {
            //close
        //}

    }

    static void rec() {
        rec();
    }

    static void m1() {
        try {
            m2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("m1");
    }

    static void m2() throws Exception {
        if (true) {
            throw new Exception("my exception");
        }
    }


}
