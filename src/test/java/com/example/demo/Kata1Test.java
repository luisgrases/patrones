package com.example.demo;

import static org.junit.Assert.*;
import org.junit.Test;

public class Kata1Test {
	
	
	@Test
	public void Retorna0SiElStringEsVacio() {
		Kata1 kata1 = new Kata1();
		assertEquals(kata1.Add(""), 0);
	}
	
	@Test
	public void RetornaElNumeroSiElStringEsUnSoloNumero() {
		Kata1 mathHelper = new Kata1();
		assertEquals(mathHelper.Add("4"), 4);
	}
	
	@Test
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorComa() {
		Kata1 mathHelper = new Kata1();
		assertEquals(mathHelper.Add("4,5"), 9);
		assertEquals(mathHelper.Add("4,5,2"), 11);
		assertEquals(mathHelper.Add("4,5,2,6"), 17);
	}

	@Test
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorPuntoYComa() {
		Kata1 mathHelper = new Kata1();
		assertEquals(mathHelper.Add("4;5"), 9);
		assertEquals(mathHelper.Add("4;5;2"), 11);
		assertEquals(mathHelper.Add("4;5;2;6"), 17);
	}
	
	@Test
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorDosPuntos() {
		Kata1 mathHelper = new Kata1();
		assertEquals(mathHelper.Add("4:5"), 9);
		assertEquals(mathHelper.Add("4:5:2"), 11);
		assertEquals(mathHelper.Add("4:5:2:6"), 17);
	}
	
	@Test
	public void RetornaLaSumaSiElStringContiene2oMasnumerosSeparadosPorCualquierSeparador() {
		Kata1 mathHelper = new Kata1();
		assertEquals(mathHelper.Add("4:5"), 9);
		assertEquals(mathHelper.Add("4,5;2"), 11);
		assertEquals(mathHelper.Add("4;5,2:6"), 17);
	}
	
}
