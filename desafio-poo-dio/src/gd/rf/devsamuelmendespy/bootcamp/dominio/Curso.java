

package gd.rf.devsamuelmendespy.bootcamp.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	private String nivelAfinidade;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}
	
	
	public Curso() {
    }
	
	
	public int getCargaHoraria() {
        return cargaHoraria;
    }
	
	public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
	
	public String getNivelAfinidade() {
		return nivelAfinidade;
	}


	public void setNivelAfinidade(String nivelAfinidade) {
		this.nivelAfinidade = nivelAfinidade;
	}

	
	// Sobrescrever método para mensagem customizada com .toString()
	@Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nivel='" + getNivelAfinidade() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }



}
