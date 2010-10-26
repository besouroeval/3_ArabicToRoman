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
	}
	
	
}
