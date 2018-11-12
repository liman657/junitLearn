package com.learn.test;

import com.learn.junitDemo.Calculate;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * author:liman
 * createtime:2018/11/12
 * mobile:15528212893
 * email:657271181@qq.com
 * comment:Junit中常用的注解测试
 */
public class AnnotationTest {

    /*
     * @Test:将一个普通的方法修饰成为一个测试方法
     * 		@Test(expected=XX.class)
     * 		@Test(timeout=毫秒 )
     * @BeforeClass：它会在所有的方法运行前被执行，static修饰
     * @AfterClass:它会在所有的方法运行结束后被执行，static修饰
     * @Before：会在每一个测试方法被运行前执行一次
     * @After：会在每一个测试方法运行后被执行一次
     * @Ignore:所修饰的测试方法会被测试运行器忽略
     * @RunWith:可以更改测试运行器 org.junit.runner.Runner
     */

    /**
     * expected指定的是预期的异常。
     */
    @Test(expected = ArithmeticException.class)
    public void testDivide(){
        assertEquals(3,new Calculate().divide(6,0));
    }

    @Ignore
    @Test(timeout=2000)
    public void testWhile(){
        while(true){
            System.out.println("run forever");
        }
    }

    @Test(timeout = 2000)
    public void testReadFile(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
