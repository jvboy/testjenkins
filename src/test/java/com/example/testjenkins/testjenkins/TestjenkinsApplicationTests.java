package com.example.testjenkins.testjenkins;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestjenkinsApplicationTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	@Test
	public void contextLoads() {
		System.out.println("fuck you ");
		System.out.println("diergefenzhi");
		System.out.println("jiushi buxing");
		System.out.println("gunnimade");
		System.out.println("阿斯顿卢卡斯就到了卡简单");
		System.out.println("最后一次");

	}

	@Test
	public void testMain(){
		System.out.println("这次总不会错了把");
	}
	@Test
	public void testnull(){
		System.out.println("只是测试一下持续继承");
		System.out.println("添加了一个分支");
		System.out.println("为什么blueocean不行呢");
		System.out.println("上次不是最后一次");


	}


}
