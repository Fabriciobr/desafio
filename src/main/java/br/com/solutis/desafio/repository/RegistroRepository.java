package br.com.solutis.desafio.repository;


import br.com.solutis.desafio.domain.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long>{

}
