package com.example.demo;

import java.util.Arrays;

public class MathHelper {

	public int Add(String string) {
		if (string == "") return 0;
		if (string.split(",").length > 2) throw new IllegalArgumentException();
		return Arrays.stream(string.split(",")).mapToInt(Integer::parseInt).sum();
	}
}
