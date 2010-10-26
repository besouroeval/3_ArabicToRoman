
public class Romans {

	public static String toRoman(int i) {
		
		String roman = "";
		int[] digits = new int[]{10,9,5,4,1};
		
		for(int d: digits) {
			while (i>=d) {
				roman += add(d);
				i-=d;
			}
		}
		
		return roman;
	}

	private static String add(int qtd) {
		switch (qtd) {
			case 10: return "X";
		}
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
