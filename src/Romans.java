
public class Romans {

	public static String toRoman(int i) {
		String roman = "";
		
		while (i>=10) {
			roman += "X";
			i-=10;
		}

		while (i>=9) {
			roman += "IX";
			i-=9;
		}
		
		if (i>=5) {
			roman += "V";
			i-=5;
		}

		if (i==4) {
			roman += "IV";
			i-=4;
		}
		
		while(i>0) {
			roman += "I";
			i--;
		}
		return roman;
	}

}
