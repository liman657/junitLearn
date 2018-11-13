package com.learn.test.Parameter;

import com.learn.junitDemo.Calculate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * author:liman
 * createtime:2018/11/13
 * mobile:15528212893
 * email:657271181@qq.com
 */
@RunWith(Parameterized.class)
public class ParametersTest {

    int expected=0;
    int input1 = 0;
    int input2 = 0;

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {3,1,2},
                {4,2,2}
        });
    }

    public ParametersTest(int expected,int input1,int input2){
        this.expected = expected;
        this.input1 = input1;
        this.input2 = input2;
    }

    @Test
    public void testAdd(){
        assertEquals(expected,new Calculate().add(input1,input2));
    }

}
