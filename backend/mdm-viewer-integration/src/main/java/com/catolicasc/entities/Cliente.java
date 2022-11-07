package com.catolicasc.entities;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity

public class Cliente {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cpf", nullable=false)
	private String cpf;
	@Column(name="senha", nullable=false)
	private String senha;
	@Column(name="nome", nullable=false)
	private String nome;
	@Column(name="inadimplente", nullable=false)
	private boolean inadimplente;
	@Column(name="tipoconsumidor", nullable=false) // Se eu coloco o name="" em camelCase o código não funciona por algum motivo
	private String tipoConsumidor;
 
    public Cliente() {}
 
    public Cliente(String cpf, String senha, String nome, boolean inadimplente, String tipoConsumidor) {
    	
    	this.cpf = cpf;
    	this.senha = senha;
    	this.nome = nome;
    	this.inadimplente = inadimplente;
    	this.tipoConsumidor = tipoConsumidor;
    }
 
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