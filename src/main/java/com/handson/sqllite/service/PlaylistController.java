package com.handson.sqllite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.dao.PlaylistDao;
import com.handson.sqllite.entities.Musica;

/**
 * @author Pedro
 *
 */
@RestController
public class PlaylistController {
	
	@Autowired
	PlaylistDao playlistDao;
    
	/**
	 * TODO: Este metodo deveria retornar um objeto PlaylistModel
	 * TODO: Implementar BO para realizar chamada para o dao e tratar informações
	 * TODO: Finalizar consulta
	 * TODO: Tratar exceptions
	 * @param user
	 * @return List<Musica>
	 */
    @RequestMapping("/playlists")
    public List<Musica> playlists(@RequestParam("user") String user) {
    	return playlistDao.findPlaylistMusicByUser(user);
    }
}
