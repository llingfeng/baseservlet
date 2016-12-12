package com.omg.test;

/**
 * Created by admin on 2016/11/4.
 */
public class Test2 {

    public static void main(String[] args){
        int x = fun();
        System.out.println(x);
    }

    public static int fun(){
        int result= 5;
        try {
            result = result/0;
            return result;
        } catch (Exception e) {
            System.out.println("Exception");
            result = -1;
            return result;
        } finally {
            result = 10;
            System.out.println("i am a finally");
        }
    }
}
