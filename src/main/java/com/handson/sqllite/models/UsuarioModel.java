/**
 * 
 */
package com.handson.sqllite.models;

/**
 * @author Pedro
 *
 */
public class UsuarioModel {
	String id;
	String nome;
	String playlistId;
	
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the playlistId
	 */
	public String getPlaylistId() {
		return playlistId;
	}
	/**
	 * @param playlistId the playlistId to set
	 */
	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}
	
	
}
