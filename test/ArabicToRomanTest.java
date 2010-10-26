import junit.framework.Assert;

import org.junit.Test;


public class ArabicToRomanTest {

	@Test
	public void shouldTranslate1to3() {
		Assert.assertEquals("I", Romans.toRoman(1));
		Assert.assertEquals("II", Romans.toRoman(2));
		Assert.assertEquals("III", Romans.toRoman(3));
	}
	
	@Test
	public void shouldTranslate5to8() {
		Assert.assertEquals("V", Romans.toRoman(5));
		Assert.assertEquals("VI", Romans.toRoman(6));
		Assert.assertEquals("VII", Romans.toRoman(7));
		Assert.assertEquals("VIII", Romans.toRoman(8));
	}
	
	@Test
	public void shouldTranslate10to13() {
		Assert.assertEquals("X", Romans.toRoman(10));
		Assert.assertEquals("XI", Romans.toRoman(11));
		Assert.assertEquals("XII", Romans.toRoman(12));
		Assert.assertEquals("XIII", Romans.toRoman(13));
	}
	
	@Test
	public void shouldTranslate15to18() {
		Assert.assertEquals("XV", Romans.toRoman(15));
		Assert.assertEquals("XVI", Romans.toRoman(16));
		Assert.assertEquals("XVII", Romans.toRoman(17));
		Assert.assertEquals("XVIII", Romans.toRoman(18));
	}
	
	@Test
	public void shouldTranslate20s() {
		Assert.assertEquals("XX", Romans.toRoman(20));
		Assert.assertEquals("XXIII", Romans.toRoman(23));
		Assert.assertEquals("XXVIII", Romans.toRoman(28));
	}
	
	@Test
	public void shouldTranslateIV() {
		Assert.assertEquals("XX", Romans.toRoman(20));
		Assert.assertEquals("XXIII", Romans.toRoman(23));
		Assert.assertEquals("XXVIII", Romans.toRoman(28));
	}
	
	
}
