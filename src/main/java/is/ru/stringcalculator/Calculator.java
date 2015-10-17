package is.ru.stringcalculator;

public class Calculator {

	public static int add(String string){
		if(string.length() == 0)
			return 0;
		checkIfNegative(numbers(string));
		return sum(numbers(string));
	}

	private static int sum(String[] numbers) {

		int total = 0;
		for(String number : numbers) {
			total += toInt(number);
		}
		return total;
	}
		
	private static int toInt (String number){
		return Integer.valueOf(number);
	}

	private static String values(String string){
		if(string.startsWith("//"))
			return string.substring(3);
		return string;

	}

	private static String delimiter(String string){
		if(string.startsWith("//"))
			return string.substring(2,3);
		return ",|\n";
	}

	private static String[] numbers(String string){
		return values(string).split(delimiter(string));
	}

	private static void checkIfNegative(String[] numbers){
		String negatives = "";
		for(String number : numbers){
			if(toInt(number)<0)
				negatives += ","+number;
		}
		if(negatives.length() > 0)
			throw new RuntimeException(negatives.substring(1));
	}
}
