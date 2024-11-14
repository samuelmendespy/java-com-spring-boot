
/*******************************************************
 *  
 * Nível: Java Básico
 * Instrutor: Gleyson Sampaio
 * Módulo: Criando Um Pequeno Sistema Para Validação de Processo Seletivo
 * 
 *******************************************************/

package gd.rf.devsamuelmendespy;


import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;



public class ProcessoSeletivo {

	public static void main(String[] args) {
		
		
		// Case 1
		System.out.println("Processo seletivo");
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
		
		// Case 4
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
		
	}
	
	/*******************************************************
	 *  Case 1
	 *  Vamos imaginar que em um processo seletivo existe o valor base
	 *  salarial de R$ 2.000,00 e o salário pretendido pelo candidato.
	 *  Vamos elaborar um controle de fluxo onde:
	 *  - Se o valor salário base for maior que valor salário pretendido,
	 *  imprima "LIGAR PARA O CANDIDATO".
	 *  - Senão, se o valor salário base base for igual ao valor salário
	 *  pretendido, imprima "LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA".
	 *
	 *******************************************************/
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
		} else {
			System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
		}
	}
	
	/*******************************************************
	 *  Case 2
	 *  Foi solicitado que nosso sistema garanta que diante das inúmeras
	 *  candidaturas sejam selecionados apenas no máximo 5 canddiatos para
	 *  entrevista onde o salário pretendido seja menor ou igual ao salário base.
	 *
	 *******************************************************/
	
	static void selecionarCandidatos() {
		// Array com a lista de candidatos
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
			
			if (salarioBase > salarioPretendido) {
				System.out.println("O candidato "+ candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
			
		}
		
	}
	
	// Gerar aleatório entre 1800 e 2200
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	/*******************************************************
	 *  Case 3
	 *  
	 *  Agora é hora de imprimir a lista dos candidatos selecionados para
	 *  disponibilizar para o RH entrar em contato.
	 *
	 *******************************************************/
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi "+ candidato);
			
		}
	}
	
	
	/*******************************************************
	 *  Case 4
	 *  
	 *  O RH deverá realizar uma ligação com no máximo 03 tentativas para
	 *  cada candidato selecionado e caso o candidato atenda, deve-se
	 *  imprimir:
	 *  - "CONSEGUIMOS CONTATO COM [ CANDIATO ] APÓS [ TENTATIVAS ] "
	 *  
	 *  Do contrário imprima:
	 *  - "NÃO CONSEGUIMOS CONTATO COM O(A) CANDIDATO(A) [CANDIDATO]".
	 *
	 *******************************************************/
	

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando) {
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while(continuaTentando && tentativasRealizadas < 3);

        if(atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativasRealizadas + " TENTATIVAS!");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " COM " + tentativasRealizadas + " TENTATIVAS!");
        }
    }
    
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
	

}
