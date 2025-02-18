package empresa.example.evento.etities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	 private Integer id;
	private String descricao;
	
	@ManyToMany(mappedBy = "categoria")
    private Set<Atividade> atividades = new HashSet<>();

	
	
	
	
	
	
	public Categoria(Integer id, String descricao, Set<Atividade> atividades) {
		
		this.id = id;
		this.descricao = descricao;
		this.atividades = atividades;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
	}
	

}
