package com.ultrapower.test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhangYunjiao
 * @date 2019/4/13 - 9:42
 */
public class TemplateTest {
    private static final String COUNTRY = "China";
    public static final String CITY = "CHONGQING";
    public static final int num = 1;
    public static final String a= "aaa";

    /**
     * 用户id
     */
    private int id;
    /**
     * 用户姓名
     */
    private String name;



    public static void main(String[] args) {

    }

    public void test() {
        System.out.println("hello");
        System.out.println("");
        System.out.println("TemplateTest.test");
        System.out.println("name = " + name);
        System.out.println(id);
        String[] s = new String[]{"1","2","2"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String s1 : s) {
            System.out.println(s1);
        }
        //list的遍历
        List l = new ArrayList();
        for (Object l1 : l) {
            System.out.println(l1);
        }
        for (int i = 0; i < l.size(); i++) {

            System.out.println(l.get(i));
        }
        for (int i = l.size() - 1; i >= 0; i--) {
            System.out.println(l.get(i));
        }
        if (l == null) {
            System.out.println("list is null");

        }
        if (l != null) {
            System.out.println("list is not null");

        }
        if (l != null) {
            System.out.println("list is not null");

        }
        if (l == null) {
            System.out.println("list is null");

        }

    }
}
