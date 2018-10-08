package com.handson.sqllite.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.handson.sqllite.entities.Musica;

/**
 * @author Pedro
 *
 */
public interface MusicaDao extends JpaRepository<Musica, Long>{

	@Query("SELECT m FROM Musica m WHERE m.nome LIKE %?1% OR m.artista.id IN (Select a.id FROM Artista a WHERE a.nome LIKE %?1%)")
	List<Musica> findByNome(String nome);
}
