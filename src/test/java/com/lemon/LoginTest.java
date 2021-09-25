package com.lemon;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

/**
 * @Project: jenkins_test
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-09-24 19:28
 * @Desc：
 **/
public class LoginTest {

    @Test
    public void test() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.class.getResourceAsStream("/application-maven.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String value = properties.getProperty("Environment");
        if("test".equals(value)) {
            Assert.fail();
        }
        System.out.println(properties);
    }

    @Test
    public void loginSuccess() {
        System.out.println("登录成功");
    }

    @Test
    public void loginFailed() {
        Assert.fail("登录失败1");
    }

    @Test
    public void loginFailed2() {
        Assert.fail("登录失败2");
    }

    @Test
    public void loginFailed3() {
        Assert.fail("登录失败3");
    }
}
