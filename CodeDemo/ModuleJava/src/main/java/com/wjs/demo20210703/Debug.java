package com.wjs.demo20210703;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: [描述该类的功能]
 * @Author: [wangjingshuo]
 * @CreateDate: [2021-07-04 20:23]
 * @UpdateUser: [wangjingshuo]
 * @UpdateDate: [2021-07-04 20:23]
 * @UpdateRemark: [说明本次修改内容]
 * @Version: [v2.0]
 */
public class Debug {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        Map<String, String> strHashMap = new HashMap<>();
        strHashMap.put("name", "Tom");
        strHashMap.put("age", "12");
        strHashMap.put("school", "Tsinghua");
        strHashMap.put("major", "computer");

        String age = strHashMap.get("age");
        System.out.println("age = " + age);

        strHashMap.remove("major");
        System.out.println(strHashMap);
    }
}
