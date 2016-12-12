package com.omg.test;

/**
 * Created by admin on 2016/11/4.
 */
public class Test {

    static boolean foo(char c){
        System.out.print(c);
        return true;
    }

    public static void main(String args[]){
        int i = 0;
        for(foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');
        }
        System.out.println();
        System.out.println((short)10/10.2);
    }
}
