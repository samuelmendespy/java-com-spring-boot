package gd.rf.devsamuelmendespy;


import java.util.Scanner;


public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int parametroUm = 12;
	
		int parametroDois = 30;

		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número "+ i + " .");
		}
		
	}
}