/**
 * 
 */
package com.handson.sqllite.models;

/**
 * @author Pedro
 *
 */
public class MusicaModel {
	private String id;
	private String nome;
	private String artistaId;
	private ArtistaModel artista;
	
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
	 * @return the artistaId
	 */
	public String getArtistaId() {
		return artistaId;
	}
	/**
	 * @param artistaId the artistaId to set
	 */
	public void setArtistaId(String artistaId) {
		this.artistaId = artistaId;
	}
	/**
	 * @return the artista
	 */
	public ArtistaModel getArtista() {
		return artista;
	}
	/**
	 * @param artista the artista to set
	 */
	public void setArtista(ArtistaModel artista) {
		this.artista = artista;
	}
	
	
}
