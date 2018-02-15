package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata2 {
	public Integer[] generate(int n) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		while (n % 2 == 0) {
           result.add(2);
           n /= 2;
        }
 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n % i == 0) {
            	result.add(i);
                n /= i;
            }
        }
        
        if (n > 2) result.add(n);
        
        Integer[] arr = {};
        return result.toArray(arr);
        
        
        
	}
}
