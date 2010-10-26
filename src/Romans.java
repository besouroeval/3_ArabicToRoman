
public class Romans {

	public static String toRoman(int i) {
		String roman = "";
		
		if (i>5) {
			roman += "I";
			i--;
		}
			
		
		while(i>0) {
			roman += "I";
			i--;
		}
		return roman;
	}

}
