
/*******************************************************
 *  
 * Nível: Java Básico
 * Instrutor: Gleyson Sampaio
 * Módulo: Criando Um Pequeno Sistema Para Validação de Processo Seletivo
 * 
 *******************************************************/

package gd.rf.devsamuelmendespy;


import java.util.Scanner;

import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;



public class ProcessoSeletivo {
	
	private static String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
	
	private static String[] selecionados = new String[5];
	
	private static double salarioBase = 2000.0;
	
	private static boolean candidatosEscolhidos = false;

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\nEscolha uma opcao:");
			System.out.println("1 - Case 1 - Controle de Fluxo");
			System.out.println("2 - Case 2 - Selecionar Candidatos");
			System.out.println("3 - Case 3 - Visualizar Selecionados");
			System.out.println("4 - Case 4 - Contatar Candidatos");
			
			opcao = scanner.nextInt();
			
			switch (opcao) {
				case 1:
					adicionarLinhas();
					terminalSimularCandidatos();
					break;
				case 2:
					adicionarLinhas();
					selecionarCandidatos();
					break;
				case 3:
					adicionarLinhas();
					imprimirSelecionados();
					break;
				case 4:
					adicionarLinhas();
					terminalContatarCandidatos();
					break;
				case 5:
					System.out.println("Encerrando programa");
				default:
					System.out.println("Opcao invalida! Tente novamente.");
					
			}
		}	while (opcao != 5);
		
		scanner.close();
			
	}
	
	static void adicionarLinhas	() {
	    for (int i = 0; i < 10; i++) {
	        System.out.println();  // Imprime 10 linhas em branco
	    }
	}

	
	static void terminalSimularCandidatos() {
		System.out.println("CASE 1");
		System.out.println("Vamos imaginar que em um processo seletivo existe o valor base");
		System.out.println("salarial de R$ 2.000,00 e o salário pretendido pelo candidato.");
		System.out.println("Vamos elaborar um controle de fluxo onde:");
		System.out.println("- Se o valor salário base for maior que valor salário pretendido, imprima `LIGAR PARA O CANDIDATO`.");
		System.out.println("- Senão, se o valor salário base base for igual ao valor salário pretendido, imprima `LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA`.");
		System.out.println("");
		System.out.println("Demonstração:");
		System.out.println("");
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
	}
	
	
	static void analisarCandidato(double salarioPretendido) {
		
		candidatosEscolhidos = false; // Definir o Processo Seletivo dos Candidatos como ainda não realizado
		
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
		} else {
			System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
		}
	}
	
	
	static void selecionarCandidatos() {
		
		if (candidatosEscolhidos == false) {
			System.out.println("CASE 2");
			System.out.println("Foi solicitado que nosso sistema garanta que diante das inúmeras");
			System.out.println("candidaturas sejam selecionados apenas no máximo 5 canddiatos para");
			System.out.println("entrevista onde o salário pretendido seja menor ou igual ao salário base.");
			System.out.println("");
			System.out.println("Demonstração:");
			System.out.println("");
			
			int candidatosSelecionados = 0;
			int candidatoAtual = 0;

			while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
				String candidato = candidatos[candidatoAtual];
				double salarioPretendido = valorPretendido();
				System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$ " + String.format("%.2f", salarioPretendido) );
				
				if (salarioBase > salarioPretendido) {
					System.out.println("O candidato "+ candidato + " foi selecionado para a vaga.");
					selecionados[candidatosSelecionados] = candidato;
					candidatosSelecionados++;
				}
				candidatoAtual++;
				
			}		
			
			candidatosEscolhidos = true; // Definir o Processo Seletivo dos Candidatos como realizado
			
		} else {
			System.out.println("Alerta: O Processo Seletivo já selecionou os candidatos!");
		}
		
	}
	
	// Gerar aleatório entre 1800 e 2200
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void imprimirSelecionados() {
		
		System.out.println("CASE 3");
		System.out.println("Agora é hora de imprimir a lista dos candidatos selecionados para\n disponibilizar para o RH entrar em contato.");
		System.out.println("");
		System.out.println("Demonstração:");
		System.out.println("");
		
		if (candidatosEscolhidos == true) {
			System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
			for (int indice = 0; indice < selecionados.length; indice++) {
				System.out.println("O candidato de nº " + (indice + 1) + " é " + selecionados[indice]);
			}
			
			System.out.println(); // Linha para melhorar exibição
			
			System.out.println("Forma abreviada de interação for each");
			
			for (String candidato: selecionados) {
				System.out.println("O candidato selecionado foi "+ candidato);
				
			}
		} else {
			System.out.println("Falha: O Processo Seletivo precisa selecionar os candidatos. ");		
		}	
	}
	
	
	static void terminalContatarCandidatos() {
		System.out.println("CASE 4");
		System.out.println("O RH deverá realizar uma ligação com no máximo 03 tentativas para \n cada candidato selecionado e caso o candidato atenda, deve-se\n imprimir:");
		System.out.println("`CONSEGUIMOS CONTATO COM [ CANDIATO ] APÓS [ TENTATIVAS ]`");
		System.out.println("Do contrário imprima:");
		System.out.println("- `NÃO CONSEGUIMOS CONTATO COM O(A) CANDIDATO(A) [CANDIDATO]`");
		System.out.println("");
		System.out.println("Demonstração:");
		System.out.println("");
		
		
		if (candidatosEscolhidos == true) {
			for (String candidato: selecionados) {
				entrandoEmContato(candidato);
				}
		} else {
			System.out.println("Falha: O Processo Seletivo precisa selecionar os candidatos. ");		
		}
		
		}

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuaTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativasRealizadas + " TENTATIVAS!");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " COM " + tentativasRealizadas + " TENTATIVAS!");
        }
    }
    
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
	

}
