package com.test.m1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: myw
 * @createTime: 2019-03-04 15:00
 */
public class TemplateTest {

    // prsf
    private static final String Code = "Code";

    // 1. psvm
    public static void main(String[] args) {

        // 2. sout, soutp, soutm, soutv
        System.out.println("");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        int num = 10;
        System.out.println(num);

        // 3. fori, iter
        String[] arr = {"111","zhangsan","Hello","Test"};

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        // 4. list.for, list.fori
        List list = new ArrayList();
        list.add(123);
        list.add("dddd");
        list.add("ceshi");

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {

        }
        
        // 5. ifn, xx.null
        if (list == null) {
            
        }

    }



}
