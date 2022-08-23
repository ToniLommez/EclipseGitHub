import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
		// Declaracao de variaveis
		double num1, num2, soma;
		
		// Leituras
		System.out.println("Digite um numero: ");
		num1 = sc.nextDouble();
		System.out.println("Digite outro numero");
		num2 = sc.nextDouble();
		
		// Somar
		soma = num1 + num2;
		
		// Mostrar na tela
		System.out.println("Soma: " + soma);
	}
}
