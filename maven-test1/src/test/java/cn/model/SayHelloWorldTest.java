package cn.model;

import org.junit.*;
import org.junit.Assert.*;
import cn.model.SayHelloWorld;
public class SayHelloWorldTest {
    @Test
	public void testHello() {
        Assert.assertEquals("hello world", new SayHelloWorld().sayHello());	
	}
}