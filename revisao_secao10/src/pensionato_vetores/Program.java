package pensionato_vetores;

import java.util.Locale;
import java.util.Scanner;

import methods_vetores.VetorMethods;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de quartos para serem alugados N: ");
		int n = sc.nextInt();		
		
		VetorMethods[] vetor = new VetorMethods[10];

		for (int i=0; i<n; i++) {
			System.out.print("\nAluguel #"+(i+1)+(": "));
			System.out.print("\nNome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int numero = sc.nextInt();
			
			VetorMethods vetormethods = new VetorMethods(nome, email);
			
			vetor[numero] = vetormethods;
		}
		
		System.out.print("\nQuartos Ocupados: ");
		for (int i=0; i<10; i++) {
			if (vetor[i]!=null) {
				System.out.print("\n" + i + ": " + vetor[i]);
			}
		}
		sc.close();
	}

}
