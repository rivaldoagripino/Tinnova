package conf;

public class Operador {
	int v[] = {5, 3, 2, 4, 7, 1, 0, 6}; 
	int a = 0;
	int i = 0;

	public void bubble() {
	System.out.print("Vetor desorganizado: ");
	for(i = 0; i<8; i++){//IMPLEMENTAR VALOR +1
		System.out.print(v[i] + " ");
	}
	System.out.println(" ");
	for(i = 0; i<7; i++){
		for(int j = 0; j<7; j++){
			if(v[j] > v[j + 1]){//FAZENDO A COMPARA플O DO VETOR POSI플O > POSI플O +1
				a = v[j];
				v[j] = v[j+1];
				v[j+1] = a;//ATRIBUINDO A NOVA POSI플O
			}
		}
	}
	System.out.print("Vetor organizado: ");
	for(i = 0; i<8; i++){
		System.out.print(v[i] + " ");
	}

	}
}
