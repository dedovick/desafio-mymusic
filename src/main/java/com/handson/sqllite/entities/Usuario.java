package com.handson.sqllite.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Pedro
 *
 */
@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
    private String id;
	
	
    private String nome;
    private String playListId;
    
    
    
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
	 * @return the playListId
	 */
	public String getPlayListId() {
		return playListId;
	}
	/**
	 * @param playListId the playListId to set
	 */
	public void setPlayListId(String playListId) {
		this.playListId = playListId;
	}
    
    
}
