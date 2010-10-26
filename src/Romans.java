
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
			case 9: return "IX";
			case 5: return "V";
			case 4: return "IV";
			case 1: return "I";
			default: return null;
		}
	}

}
