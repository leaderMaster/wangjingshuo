package com.wjs.demo20210708;

import com.wjs.dmo20210708.HelloMaven;
import org.junit.Test;

/**
 * @Description: [描述该类的功能]
 * @Author: [wangjingshuo]
 * @CreateDate: [2021-07-08 22:05]
 * @UpdateUser: [wangjingshuo]
 * @UpdateDate: [2021-07-08 22:05]
 * @UpdateRemark: [说明本次修改内容]
 * @Version: [v2.0]
 */
public class HelloMavenTest {

    @Test
    public void helloMaven() {
        HelloMaven helloMaven = new HelloMaven();
        String maven = helloMaven.sayHello("Maven");
        System.out.println("maven = " + maven);
    }
}
