package com.rakesh.springdemo.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] sort(int[] numbers) {
		
		return numbers;
	}

}
