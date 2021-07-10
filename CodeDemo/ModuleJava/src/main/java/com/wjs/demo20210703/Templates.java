package com.wjs.demo20210703;

import com.wjs.module20210703.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: [描述该类的功能]
 * @Author: [wangjingshuo]
 * @CreateDate: [2021-07-03 19:15]
 * @UpdateUser: [wangjingshuo]
 * @UpdateDate: [2021-07-03 19:15]
 * @UpdateRemark: [说明本次修改内容]
 * @Version: [v2.0]
 */
public class Templates {

    //模版一：psvm
    public static void main(String[] args) {
        //模版二：sout
        System.out.println("HelloWorld!!");
        System.out.println("------------------------------");
        //sout 变形一：soutp
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("------------------------------");
        //sout 变形一：soutv
        System.out.println("args = " + args);
        System.out.println("------------------------------");
        //sout 变形一：soutm
        System.out.println("Templates.main");
        System.out.println("------------------------------");
        //sout 变形一：xxx.sout
        System.out.println(args);
        System.out.println("==============================");
        //模版三：fori
        String[] strArray = {"Tom", "Jerry", "HanMeiMei", "liLei"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("------------------------------");
        //fori 变形：itar
        for (int i = 0; i < strArray.length; i++) {
            String s = strArray[i];
            System.out.println(s);
        }
        System.out.println("------------------------------");
        //fori 变形：array.fori
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("------------------------------");
        //fori 变形：array.forr
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.println(strArray[i]);
        }
        System.out.println("------------------------------");
        //fori 变形：iter
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        //fori 变形：array.for
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("==============================");
        //模版四：list.fori
        List<String> strList = new ArrayList<>();
        strList.add("123");
        strList.add("456");
        strList.add("789");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println("------------------------------");
        //list.fori 变形：list.for
        for (String s : strList) {
            System.out.println(s);
        }
        System.out.println("------------------------------");
        //list.fori 变形：list.forr
        for (int i = strList.size() - 1; i >= 0; i--) {
            System.out.println(strList.get(i));
        }
        System.out.println("==============================");
        //模版五：ifn
        if (strList == null) {

        }
        System.out.println("------------------------------");
        //ifn 变形：inn
        if (strList != null) {

        }
        System.out.println("------------------------------");
        //ifn 变形：xxx.null
        if (strList == null) {

        }
        System.out.println("------------------------------");
        //ifn 变形：xxx.nn
        if (strList != null) {
            
        }
        System.out.println("==============================");
    }
    //模版六：prsf
    private static final Customer CUS = new Customer();
    //prsf 变形：psf
    public static final int NUM1 = 1;
    //prsf 变形：psfi
    /*
     * int 类型常量
     */
    public static final int NUM2 = 2;
    //prsf 变形：psfs
    /*
     * String 类型常量
     */
    public static final String NATION = "CHINA";
}
