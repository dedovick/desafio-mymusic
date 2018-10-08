package com.handson.sqllite.service;
import org.springframework.web.bind.annotation.RestController;

import com.handson.sqllite.dao.MusicaDao;
import com.handson.sqllite.entities.Musica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Pedro
 *
 */
@RestController
public class MusicController {
	
	@Autowired
	MusicaDao musicaDao;
    
	/**
	 * TODO: Este metodo deveria retornar uma List<MusicaModel>
	 * TODO: Implementar BO para realizar chamada para o dao e tratar informações
	 * TODO: Finalizar consulta
	 * TODO: Tratar exceptions
	 * @param user
	 * @return List<Musica>
	 */
    @RequestMapping("/musicas")
    public List<Musica> musicas(@RequestParam("filtro") String filtro) {
    	return musicaDao.findByNome(filtro);
    }
}
