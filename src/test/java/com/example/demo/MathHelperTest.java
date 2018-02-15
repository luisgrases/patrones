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
	
	@Test
	public void RetornaLaSumaSiElStringContiene3oMasnumerosSeparadosPorComa() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add("4,5,2"), 11);
		assertEquals(mathHelper.Add("4,5,2,6"), 17);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void DisparaErrorSiRecibeUnSeparadorIncorrecto() {
		MathHelper mathHelper = new MathHelper();
		mathHelper.Add("4;8");
	}
}
