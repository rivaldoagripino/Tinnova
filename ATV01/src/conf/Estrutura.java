package conf;

import java.text.DecimalFormat;

public class Estrutura {
	private static DecimalFormat d = new DecimalFormat("##");
	private double total_eleitores = 1000;
	private double validos = 800;
	private double brancos = 150;
	private double nulos = 50;
	
	public double getTotal_eleitores() {
		return total_eleitores;
	}
	
	public double getValidos() {
		return validos;
	}
	
	public double getBrancos() {
		return brancos;
	}
	
	public double getNulos() {
		return nulos;
	}

	public void validos() {
		System.out.println("O Percentual de votos válidos é: " + d.format((getValidos() / getTotal_eleitores())*100) + "%");
	}
	
	public void brancos() {
		System.out.println("O Percentual de votos em branco é: " + d.format((getBrancos() / getTotal_eleitores())*100) + "%");
	}
	
	public void nulos() {
		System.out.println("O Percentual de votos nulos é: " + d.format((getNulos() / getTotal_eleitores())*100) + "%");
	}

	
	
	
	
	
	

}
