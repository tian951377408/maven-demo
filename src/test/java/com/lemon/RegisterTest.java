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
public class RegisterTest {


    @Test
    public void registerSuccess() {
        System.out.println("注册成功");
    }

    @Test
    public void registerFailed() {
        Assert.fail("注册失败1");
    }

    @Test
    public void registerFailed2() {
        Assert.fail("注册失败2");
    }

    @Test
    public void registerFailed3() {
        Assert.fail("注册失败3");
    }
}
