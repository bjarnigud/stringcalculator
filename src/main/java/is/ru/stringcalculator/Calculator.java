package is.ru.stringcalculator;

public class Calculator {

	public static int add(String string){
		if(string.length() == 0)
			return 0;
		return sum(string.split(","));
	}

	private static int sum(String[] numbers) {
		int total = 0;
		for(String number : numbers) {
			total += toInt(number);
		}
		return total;
	}
		
	private static int toInt (String number){
		return Integer.parseInt(number);
	}

}
