package com.rakesh.springdemo.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberForSearch) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortedNumbers);
		return 3;
	}

}
