package com.example.demo;

public class MathHelper {

	public int Add(String string) {
		return (string == "") ? 0 : Integer.parseInt(string);
	}
}
