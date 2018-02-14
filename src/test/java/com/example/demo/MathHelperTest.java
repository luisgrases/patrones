package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathHelperTest {

	@Test
	public void Retorna0SiElStringEsVacio() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add(""), 0);
	}

}
