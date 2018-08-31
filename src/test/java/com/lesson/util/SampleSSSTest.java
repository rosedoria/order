package com.lesson.util;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rosedoria on 2018/8/28.
 */
@RunWith(value=JUnit4.class)
public class SampleSSSTest {

    public SampleSSSTest() {
        super();
    }


    // 测试方法。
    // 方法名称必须以test开头，没有参数，无返回值，是公开的，可以抛出异常
    // 也即类似public void testXXX() throws Exception {}
    @Test
    public void testMathPow() {
        System.out.println("Test Math.pow");
        Assert.assertEquals(4.0, Math.pow(2.0, 2.0));
    }
    @Test
    public void testMathMin() {
        System.out.println("Test Math.min");
        Assert.assertEquals(2.0, Math.min(2.0, 4.0));
    }

    @Test
    public void testMethodOne(){
        Assert.assertTrue(true);
    }

    @Test
    public void testMethodTwo(){
        Assert.assertTrue(false);
    }

    public static void main(String[] args) {
        System.out.println(Math.min(2.0, 4.0));
    }

}
