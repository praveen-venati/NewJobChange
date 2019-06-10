package com.challenges;

public class NumberToWordImplementation {

	private static final String[] millions = { "", " thousand", " million", " billion", " trillion", " quadrillion",
			" quintillion" };

	private static final String[] tens = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy",
			" eighty", " ninety" };

	private static final String[] units = { "", " one", " two", " three", " four", " five", " six", " seven", " eight",
			" nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen",
			" eighteen", " nineteen" };

	private static String convertLessThanOneThousand(int number) {
		String current;

		if (number % 100 < 20) {
			current = units[number % 100];
			number /= 100;
		} else {
			current = units[number % 10];
			number /= 10;

			current = tens[number % 10] + current;
			number /= 10;
		}
		if (number == 0)
			return current;
		return units[number] + " hundred" + current;
	}

	public static String convert(long number) {
		String prefix = "";
		String current = "";
		try {
		if (number == 0) {
			return "zero";
		}
		
		if (number < 0) {
			number = Math.abs(number);
			prefix = "negative";
		}
		
		int place = 0;
		
		do {
			int n = (int) (number % 1000);
			if (n != 0) {
				String s = convertLessThanOneThousand(n);
				current = s + millions[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);
		
		}
		catch(Exception exe)
		{
			//adding printstracktrace because, as I am not using logger so that, I will be able to find the root cause easily
			exe.printStackTrace();
		}

		return (prefix + current).trim();
	}

	public String findMissingValues(long number) {
		// TODO Auto-generated method stub
		return convert(number);
	}

}
