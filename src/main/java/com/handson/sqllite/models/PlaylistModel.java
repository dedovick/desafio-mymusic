/**
 * 
 */
package com.handson.sqllite.models;

import java.util.List;

/**
 * @author Pedro
 *
 */
public class PlaylistModel {

	private String id;
	private List<PlaylistMusicaModel> playlistMusicas;
	private UsuarioModel usuario;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the usuario
	 */
	public UsuarioModel getUsuario() {
		return usuario;
	}
	
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the playlistMusicas
	 */
	public List<PlaylistMusicaModel> getPlaylistMusicas() {
		return playlistMusicas;
	}

	/**
	 * @param playlistMusicas the playlistMusicas to set
	 */
	public void setPlaylistMusicas(List<PlaylistMusicaModel> playlistMusicas) {
		this.playlistMusicas = playlistMusicas;
	}
	
	
	
}
