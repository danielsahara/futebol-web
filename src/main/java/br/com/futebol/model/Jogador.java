package br.com.futebol.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Jogador implements Serializable{
	@Id
	private BigInteger id;
	
	@NotEmpty(message="O nome é Obrigatório")
	private String nome;
	
	@NotEmpty(message="O email é obrigatório")
	@Email(message="Email inválido")
	private String email;
	
	@NotEmpty(message="O celular é obrigatório")
	private String celular;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}
