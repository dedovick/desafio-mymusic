package com.handson.sqllite.entities;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author Pedro
 *
 */
@Table(name = "PlaylistsMusicas")
public class PlaylistsMusicas {

	@Column( name = "PlaylistId")
	private String idPlaylist;

	@Column( name = "MusicaId")
	private String idMusica;

	/**
	 * @return the idPlaylist
	 */
	public String getIdPlaylist() {
		return idPlaylist;
	}

	/**
	 * @param idPlaylist the idPlaylist to set
	 */
	public void setIdPlaylist(String idPlaylist) {
		this.idPlaylist = idPlaylist;
	}

	/**
	 * @return the idMusica
	 */
	public String getIdMusica() {
		return idMusica;
	}

	/**
	 * @param idMusica the idMusica to set
	 */
	public void setIdMusica(String idMusica) {
		this.idMusica = idMusica;
	}
	
	
}
