package com.catolicasc.entities;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Cliente {

	private String cpf;
	private String senha;
	private String nome;
	private boolean inadimplente;
	private String tipoConsumidor;
 
    public Cliente() {
    }
 
    public Cliente(String cpf, String senha, String nome, boolean inadimplente, String tipoConsumidor) {
    	this.cpf = cpf;
    	this.senha = senha;
    	this.nome = nome;
    	this.inadimplente = inadimplente;
    	this.tipoConsumidor = tipoConsumidor;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getCpf() {
        return cpf;
    }

	public String getSenha() {
		return senha;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isInadimplente() {
		return inadimplente;
	}

	public void setInadimplente(boolean inadimplente) {
		this.inadimplente = inadimplente;
	}

	public String getTipoConsumidor() {
		return tipoConsumidor;
	}

	public void setTipoConsumidor(String tipoConsumidor) {
		this.tipoConsumidor = tipoConsumidor;
	}
}