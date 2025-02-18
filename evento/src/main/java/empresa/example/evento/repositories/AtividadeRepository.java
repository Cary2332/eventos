package empresa.example.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import empresa.example.evento.etities.Atividade;

@Repository
public interface  AtividadeRepository extends JpaRepository<Atividade, Long> {

}
