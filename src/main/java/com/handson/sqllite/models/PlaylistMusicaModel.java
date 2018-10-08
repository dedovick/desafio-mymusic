/**
 * 
 */
package com.handson.sqllite.models;


/**
 * @author Pedro
 *
 */
public class PlaylistMusicaModel {

	private String playlistId;
	private String musicaId;
	private MusicaModel musica;
	
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
	
	/**
	 * @return the musicaId
	 */
	public String getMusicaId() {
		return musicaId;
	}
	
	/**
	 * @param musicaId the musicaId to set
	 */
	public void setMusicaId(String musicaId) {
		this.musicaId = musicaId;
	}
	
	/**
	 * @return the musica
	 */
	public MusicaModel getMusica() {
		return musica;
	}
	
	/**
	 * @param musica the musica to set
	 */
	public void setMusica(MusicaModel musica) {
		this.musica = musica;
	}
	
	
	
}
