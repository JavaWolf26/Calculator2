package Calculator1;

public class Calculator3 {

	public static void main(String[] args) throws java.io.IOException {

		System.out.println("Vvedite arifmeti4eskoe virazenie,");
		System.out.println("neobhodimi arabskie 4isla ot 0 do 9");
		System.out.println("i arifmeti4eskie operacii +, -, * ili /.");

		char c1 = (char) System.in.read();
		char carif = (char) System.in.read();
		char c2 = (char) System.in.read();
		int i1;
		int i2;
		int result;

		if (c1 >= '0' && c1 <= '9') {
			i1 = Character.getNumericValue(c1);
			if (c2 >= '0' && c2 <= '9') {
				i2 = Character.getNumericValue(c2);
				if (carif == '+' || carif == '-' || carif == '*' || carif == '/') {

					if (carif == '+') {
						result = i1 + i2;
						System.out.println(result);
					} else if (carif == '-') {
						result = i1 - i2;
						System.out.println(result);
					} else if (carif == '*') {
						result = i1 * i2;
						System.out.println(result);
					} else if (carif == '/') {
						try {
							result = i1 / i2;
							if (i1 % i2 == 0) {
								System.out.print(result);
							} else
								System.out.print(result + "; Ostatoc: " + i1 % i2);
						} catch (ArithmeticException e) {
							System.out.println("Delit' na 0 nelza!");
						}
					}
				} else
					System.out.println("Neverno");
			} else
				System.out.println("Neverno");
		} else
			System.out.println("Neverno");
	}
}
