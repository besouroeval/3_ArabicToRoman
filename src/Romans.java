
public class Romans {

	public static String toRoman(int i) {
		String roman = "";
		
		while (i>=10) {
			roman += add(10);
			i-=10;
		}

		while (i>=9) {
			roman += add(9);
			i-=9;
		}
		
		while (i>=5) {
			roman += add(5);
			i-=5;
		}

		while (i>=4) {
			roman += add(4);
			i-=4;
		}
		
		while (i>=1) {
			roman += add(1);
			i--;
		}
		
		return roman;
	}

	private static String add(int qtd) {
		if (qtd == 10)
			return "X";
		if (qtd == 9)
			return "IX";
		if (qtd == 5)
			return "V";
		if (qtd == 4)
			return "IV";
		if (qtd == 1)
			return "I";
		
		return null;
	}

}
