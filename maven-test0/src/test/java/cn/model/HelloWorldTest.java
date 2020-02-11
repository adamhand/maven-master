package cn.model;

import org.junit.*;
import org.junit.Assert.*;
import cn.model.HelloWorld;
public class HelloWorldTest {
    @Test
	public void testHello() {
        Assert.assertEquals("hello world", new HelloWorld().hello());	
	}
}