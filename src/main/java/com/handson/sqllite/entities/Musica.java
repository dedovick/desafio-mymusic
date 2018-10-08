package com.handson.sqllite.entities;
import java.io.Serializable;

import javax.persistence.Column;
/**
 * @author Pedro
 *
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Musicas")
public class Musica implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    private String id;
	
	@OneToOne
    @JoinColumn(name = "ArtistaId")
    private Artista artista;
	
	@Column(name = "Nome")
    private String nome;
    
    
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
	 * @return the artistaId
	 */
	public Artista getArtista() {
		return artista;
	}
	/**
	 * @param artistaId the artistaId to set
	 */
	public void setArtista(Artista artista) {
		this.artista = artista;
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
    
    
}
