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
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorComa() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add("4,5"), 9);
		assertEquals(mathHelper.Add("4,5,2"), 11);
		assertEquals(mathHelper.Add("4,5,2,6"), 17);
	}

	@Test
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorPuntoYComa() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add("4;5"), 9);
		assertEquals(mathHelper.Add("4;5;2"), 11);
		assertEquals(mathHelper.Add("4;5;2;6"), 17);
	}
	
	@Test
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorDosPuntos() {
		MathHelper mathHelper = new MathHelper();
		assertEquals(mathHelper.Add("4:5"), 9);
		assertEquals(mathHelper.Add("4:5:2"), 11);
		assertEquals(mathHelper.Add("4:5:2:6"), 17);
	}
}
