package com.rakesh.springdemo.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.rakesh.springdemo.SpringdemoBasicApplication;

@RunWith(SpringRunner.class) 
@ContextConfiguration(classes = SpringdemoBasicApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearchImpl  binarySearch;
	
	@Test
	public void testBasicSenario() {
		int result=binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, result);
	}
	

}
