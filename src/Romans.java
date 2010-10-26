
public class Romans {

	public static String toRoman(int i) {
		String roman = "";
		
		while (i>=10) {
			roman = add(roman, 10);
			i-=10;
		}

		while (i>=9) {
			roman += add(roman, 9);
			i-=9;
		}
		
		while (i>=5) {
			roman += "V";
			i-=5;
		}

		while (i>=4) {
			roman += "IV";
			i-=4;
		}
		
		while (i>=1) {
			roman += "I";
			i--;
		}
		
		return roman;
	}

	private static String add(String roman, int qtd) {
		roman += "X";
		return roman;
	}

}
