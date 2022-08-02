package br.com.project.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	Curso findByNome(String nome);

}
