import junit.framework.Assert;

import org.junit.Test;


public class ArabicToRomanTest {

	@Test
	public void shouldTranslate1() {
		Assert.assertEquals("I", Romans.toRoman(1));
	}
	
	
}
