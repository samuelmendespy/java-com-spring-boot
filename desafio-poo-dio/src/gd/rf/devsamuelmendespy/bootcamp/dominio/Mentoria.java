/*******************************************************
 *  
 * Nível: Java Básico
 * Instrutor: Camila Cavalcante
 * Módulo: Abstraindo um Bootcamp Usando Orientação a Objetos em Java
 * 
 *******************************************************/


package gd.rf.devsamuelmendespy.bootcamp.dominio;


import java.time.LocalDate;

public class Mentoria extends Conteudo {

	
	private LocalDate data;
	
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}
	
	public Mentoria() {
    }
	
	public LocalDate getData() {
        return data;
    }
	
	public void setData(LocalDate data) {
        this.data = data;
    }
	
	
	// Sobrescrever método
	@Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
