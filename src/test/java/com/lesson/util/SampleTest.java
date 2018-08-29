package com.lesson.util;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rosedoria on 2018/8/28.
 */
public class SampleTest extends TestCase {

    public SampleTest() {
        super();
    }

    // 传入测试用例名称
    public SampleTest(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("Set up");
    }

    // 测试方法。
    // 方法名称必须以test开头，没有参数，无返回值，是公开的，可以抛出异常
    // 也即类似public void testXXX() throws Exception {}
    public void testMathPow() {
        System.out.println("Test Math.pow");
        Assert.assertEquals(4.0, Math.pow(2.0, 2.0));
    }

    public void testMathMin() {
        System.out.println("Test Math.min");
        Assert.assertEquals(2.0, Math.min(2.0, 4.0));
    }

    // 在每个Test运行之后运行
    @Override
    protected void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }

    @Test
    public void testMethodTwo(){
        Assert.assertTrue(false);
    }

}
