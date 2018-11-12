package com.learn.test;

import org.junit.*;

/**
 * author:liman
 * createtime:2018/11/12
 * mobile:15528212893
 * email:657271181@qq.com
 * comment:
 *  测试各种注解
 */
public class JunitFlowTest {

    /*
     * 1.@BeforeClass修饰的方法会在所有方法被调用前被执行，
     *  而且该方法是静态的，所以当测试类被加载后接着就会运行它，
     *  而且在内存中它只会存在一份实例，它比较适合加载配置文件。
     * 2.@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库的连接,也只会执行一次
     *
     * 3.@Before和@After会在每个测试方法的前后各执行一次。
     *
     */

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("this is beforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("this is afterClass");
    }

    @Before
    public void setUp(){
        System.out.println("this is before method ......");
    }

    @After
    public void tearDown(){
        System.out.println("this is after method ......");
    }

    @Test
    public void test1(){
        System.out.println("this is test1");
    }

    @Test
    public void test2(){
        System.out.println("this is test2");
    }

}
