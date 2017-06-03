package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.SampleController;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = SampleController.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
