/*******************************************************
 *  
 * Nível: Java Básico
 * Instrutor: Camila Cavalcante
 * Módulo: Abstraindo um Bootcamp Usando Orientação a Objetos em Java
 * 
 *******************************************************/



package gd.rf.devsamuelmendespy.bootcamp;

import java.time.LocalDate;

import gd.rf.devsamuelmendespy.bootcamp.dominio.Curso;
import gd.rf.devsamuelmendespy.bootcamp.dominio.Mentoria;
import gd.rf.devsamuelmendespy.bootcamp.dominio.Dev;
import gd.rf.devsamuelmendespy.bootcamp.dominio.Bootcamp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciar Cursos
		Curso curso1 = new Curso();
		curso1.setTitulo("Introdução ao Java");
		curso1.setDescricao("Curso introdutório sobre Java");
		curso1.setCargaHoraria(8);
		curso1.setNivelAfinidade("Básico");
		
		Curso curso2 = new Curso();
        curso2.setTitulo("Promises em Javascript");
        curso2.setDescricao("Aplicações de Operações com Promises em Javascript");
        curso2.setCargaHoraria(4);
        curso1.setNivelAfinidade("Intermediário");
        
        Curso curso3 = new Curso();
        curso3.setTitulo("Async/Await em Javascript");
        curso3.setDescricao("Aplicações de Operações com Async/Await em Javascript");
        curso3.setCargaHoraria(2);
        curso3.setNivelAfinidade("Avançado");
        
        // Instanciar Mentorias
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Carreira Internacional com Java");
        mentoria1.setDescricao("Mentoria para Programadores de Java");
        mentoria1.setData(LocalDate.now());
        
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Guia para trabalhar com Javascript ");
        mentoria2.setDescricao("Mentoria para iniciantes em Java");
        mentoria2.setData(LocalDate.now());
        
        // Instanciar Bootcamps
        
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java e Javascript");
        bootcamp1.setDescricao("Aprenda Java e Javascript do Básico ao Avançado");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);
 

        
        // Instanciar Dev
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
	}

}
