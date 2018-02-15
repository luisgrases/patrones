package com.example.demo;

import java.util.Arrays;

public class MathHelper {

	public int Add(String string) {
		if (string == "") return 0;
		return Arrays.stream(string.split(";|:|,")).mapToInt(Integer::parseInt).sum();
	}
}
