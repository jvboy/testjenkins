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



	}

	@Test
	public void testMain(){
		System.out.println("这次总不会错了把");
	}
	@Test
	public void testnull(){
		System.out.println("只是测试一下持续继承");
		System.out.println("添加了一个分支");


	}


}
