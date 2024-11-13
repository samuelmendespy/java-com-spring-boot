package rf.gd.devsamuelmendespy.contabanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, digite o nome do cliente !");
		String nomeCliente = scanner.nextLine();
		
		System.out.print("Por favor, digite o número da agência !");
		String numeroAgencia = scanner.nextLine();
		
		System.out.print("Por favor, digite o número da conta !");
		String numeroConta = scanner.nextLine();
		
		
		System.out.print("Por favor, digite o saldo da conta !");
		String textSaldo = scanner.nextLine();
		
		textSaldo = textSaldo.trim();
		textSaldo = textSaldo.replace(",", ".");
		
		double saldo = Double.parseDouble(textSaldo);
		
		
		System.out.println("Olá " + nomeCliente +" , obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + " , conta " + numeroConta + " e seu saldo " + String.format("%.2f",saldo) + " já está disponível para saque.");
		
		scanner.close();
		
	}

}
