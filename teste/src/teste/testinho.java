package teste;

import java.util.Locale;
import java.util.Scanner;

public class testinho {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		System.out.println("Testando o nextLine");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("mimimi \n");
		String name = sc.nextLine();
		
		System.out.println(name);
		sc.close();
	}

}
