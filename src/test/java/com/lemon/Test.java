package com.lemon;

import java.io.IOException;
import java.util.Properties;

/**
 * @Project: jenkins_test
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-09-24 19:17
 * @Desc：
 **/
public class Test {

    @org.testng.annotations.Test
    public void test() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.class.getResourceAsStream("/application-maven.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = properties.getProperty("Environment");
        System.out.println(properties);
    }
}
