package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class Kata2Test {
	
	
	@Test
	public void RetornaLosFactoresPrimosDeNExcluyendoEl1yN() {
		Kata2 kata2 = new Kata2();
		assertArrayEquals(kata2.generate(1), new Integer[0]);
		assertArrayEquals(kata2.generate(2), new Integer[]{2});
		assertArrayEquals(kata2.generate(9), new Integer[]{3,3});
		assertArrayEquals(kata2.generate(36), new Integer[]{2,2,3,3});
		assertArrayEquals(kata2.generate(4620), new Integer[]{2,2,3,5,7,11});
	}
}
