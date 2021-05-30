package conf;

import java.util.Scanner;

public class Operador {
	Scanner sc = new Scanner(System.in);
	int a, b;
	
	public void operacao() {
		System.out.println("Digite um valor: ");
		b = sc.nextInt();
		for(a = 1; b >1; b = b -1) {//controle. fat é igual a 1 independente, condição de execução será n > 1 e por ultimo o decremento.
			a = a*b;//aplica a multiplicação de acordo com a condição
		} System.out.printf("%n%d", a);// O %n cria uma nova linha e o %d é de um inteiro decimal
		
	}
	

}
