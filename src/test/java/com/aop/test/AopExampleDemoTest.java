package com.aop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aop.test.services.AopExampleDemo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopExampleDemoTest {

	@Autowired
	AopExampleDemo service;
	
	
	@Test
	public void testSayHiSayBye() {
		service.sayHi();
		service.sayBye();
	}
}
