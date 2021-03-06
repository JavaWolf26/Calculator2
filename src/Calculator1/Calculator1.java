package Calculator1;

import java.util.Scanner;
import java.util.Arrays;

public class Calculator1 {

	public static void main(String[] args) throws java.io.IOException {

		String cifra1[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String cifra2[] = { "null", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		System.out.println("Vvedite arifmeti4eskoe virazenie,");
		System.out.println("neobhodimi arabskie 4isla ot 0 do 9");
		System.out.println("ili rimskie 4isla ot I do IX");
		System.out.println("i arifmeti4eskie operacii +, -, * ili /.");
		System.out.println("Vvedite 4isla i operacii 4erez probel:");

		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String arif = in.next();
		String str2 = in.next();
		int i1;
		int i2;
		int result;

		if (Arrays.asList(cifra1).contains(str1)) {
			switch (str1) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				i1 = Arrays.asList(cifra1).indexOf(str1);

				if (Arrays.asList(cifra1).contains(str2)) {
					switch (str2) {
					case "0":
					case "1":
					case "2":
					case "3":
					case "4":
					case "5":
					case "6":
					case "7":
					case "8":
					case "9":
						i2 = Arrays.asList(cifra1).indexOf(str2);

						switch (arif) {
						case "+":
							result = i1 + i2;
							System.out.print(result);
							break;
						case "-":
							result = i1 - i2;
							System.out.print(result);
							break;
						case "*":
							result = i1 * i2;
							System.out.print(result);
							break;
						case "/":
							try {
								result = i1 / i2;
								if (i1 % i2 == 0)
									System.out.print(result);
								else
									System.out.print(result + "; Ostatoc: " + i1 % i2);
							} catch (ArithmeticException e) {
								System.out.println("Delit' na 0 nelza!");
							}
							break;
						default:
							System.out.println("Nevernii format arifmeti4eskogo virazenia");
						}
					}
				} else
					System.out.println("Nevernii format arifmeti4eskogo virazenia");
			}
		} else if (Arrays.asList(cifra2).contains(str1)) {
			switch (str1) {
			case "null":
			case "I":
			case "II":
			case "III":
			case "IV":
			case "V":
			case "VI":
			case "VII":
			case "VIII":
			case "IX":
				i1 = Arrays.asList(cifra2).indexOf(str1);

				if (Arrays.asList(cifra2).contains(str2)) {
					switch (str2) {
					case "null":
					case "I":
					case "II":
					case "III":
					case "IV":
					case "V":
					case "VI":
					case "VII":
					case "VIII":
					case "IX":
						i2 = Arrays.asList(cifra2).indexOf(str2);

						switch (arif) {
						case "+":
							result = i1 + i2;
							System.out.print(result);
							break;
						case "-":
							result = i1 - i2;
							System.out.print(result);
							break;
						case "*":
							result = i1 * i2;
							System.out.print(result);
							break;
						case "/":
							try {
								result = i1 / i2;
								if (i1 % i2 == 0)
									System.out.print(result);
								else
									System.out.print(result + "; Ostatoc: " + i1 % i2);
							} catch (ArithmeticException e) {
								System.out.println("Delit' na 0 nelza!");
							}
							break;
						default:
							System.out.println("Nevernii format arifmeti4eskogo virazenia");
						}
					}
				} else
					System.out.println("Nevernii format arifmeti4eskogo virazenia");
			}
		} else
			System.out.println("Nevernii format arifmeti4eskogo virazenia");
		in.close();
	}
}