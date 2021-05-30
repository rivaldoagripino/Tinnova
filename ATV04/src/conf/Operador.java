package conf;

import java.util.Scanner;
public class Operador {
	Scanner sc = new Scanner(System.in);
	int a = 3;
	int b = 5;
	int c = 0;
	int opc;
	
	public void operacao() {
		System.out.println("Digite um valor e irei somar todos os multiplos de 3 ou 5 até este valor. ");
		opc = sc.nextInt();
		for(int i = 0; i < opc; i++){//controle
		    if(i % a == 0 || i % b == 0){//utilização do comparador OU
		        c += i;//incrementação
		    }
		}
		System.out.println("A soma entre os números 3 e 5 abaixo de 10 é: " + c);
	}
	

}
