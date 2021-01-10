package course;

import java.util.Locale;
import java.util.Scanner;

public class Vect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: "); //define tamanho do vetor
		int n = sc.nextInt();
		
		Double[] vect = new Double[n];
		
		for(int i=0; i < n; i++) {
			System.out.println("Digite a altura: "); //adiciona os elementos ao vetor
			vect[i] = sc.nextDouble();
			
		}
		
		double sum =0;
		for(int i =0 ; i < n ; i++) {	//soma os elementos do vetor 
			sum += vect[i];
			
		}
		
		sum = sum / n; //calcula a média dos elementos
		System.out.printf("A média das alturas é: %.2f%n", sum); 
		
		
		System.out.println("one more commit");
		
		
		sc.close(); // fecha o scanner
			
		
		

	}

}
