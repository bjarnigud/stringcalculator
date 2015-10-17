package is.ru.stringcalculator;

public class Calculator {

	public static int add(String string){
		if(string.length() == 0)
			return 0;
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
		return Integer.parseInt(number);
	}

	private static String values(String string)
	{
		if(string.startsWith("//"))
			return string.substring(3);
		return string;

	}

	private static String delimiter(String string)
	{
		if(string.startsWith("//"))
			return string.substring(2,3);
		return ",|\n";
	}

	private static String[] numbers(String string){
		return values(string).split(delimiter(string));
	}
}
