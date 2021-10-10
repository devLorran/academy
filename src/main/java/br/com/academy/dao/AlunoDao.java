package br.com.academy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.academy.models.Aluno;
@Repository
@Component("Rep1")
public interface AlunoDao extends JpaRepository<Aluno, Integer> {
	
}
