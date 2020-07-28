package com.pogorelov.gradledemo;


import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void test() {
        Service service = new Service();
        String result = service.getMessage();
        System.out.println(result);
        Assert.assertEquals("2 b || ! 2 b", result);
    }
}
