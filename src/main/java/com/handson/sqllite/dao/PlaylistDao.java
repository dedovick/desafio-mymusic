package com.handson.sqllite.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.handson.sqllite.entities.Musica;
import com.handson.sqllite.entities.Playlists;

/**
 * @author Pedro
 *
 */
public interface PlaylistDao extends JpaRepository<Playlists, Long> {
	
	@Query("SELECT * FROM Music m WHERE m.id = ?1")
	List<Musica> findPlaylistMusicByUser(String nome);
	
}
