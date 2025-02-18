package empresa.example.evento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import empresa.example.evento.dto.AtividadeDTO;
import empresa.example.evento.etities.Atividade;
import empresa.example.evento.repositories.AtividadeRepository;

@Service
public class AtividadeService {
	
	@Autowired
	AtividadeRepository repo;
	
	public List<AtividadeDTO> buscarTodos(){
		List<Atividade> list = repo.findAll();
		return list.stream().map(x -> new AtividadeDTO(x)).toList();
	}
}
