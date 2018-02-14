package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathHelperTest {

	@Test
	public void Retorna0SiElStringEsVacio() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add(""), 0);
	}
	
	@Test
	public void RetornaElNumeroSiElStringEsUnSoloNumero() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add("4"), 4);
	}
	
	@Test
	public void RetornaLaSumaSiElStringContiene2numerosSeparadosPorComa() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add("4,5"), 9);
	}

}
