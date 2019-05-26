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
//		TestjenkinsApplication.main(null)
		try {
			assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
		} catch (AssertionError e) {
			fail("\"message\" is not \"Hello World!\"");
		}
	}
	@Test
	public void testnull(){
		System.out.println("只是测试一下持续继承");
		try {
			assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
		} catch (AssertionError e) {
			fail("\"message\" is not \"Hello World!\"");
		}
	}


}
