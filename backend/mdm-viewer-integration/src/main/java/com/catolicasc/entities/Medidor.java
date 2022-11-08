package com.catolicasc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
 
@Entity

public class Medidor {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable=false)
	private int id;
	@Column(name="provisionado", nullable=false)
	private boolean provisionado;
	@Column(name="datamedicao", nullable=false) // Quando eu deixo o name="" em camelCase o sistema não funciona
	private Date dataMedicao;
	@Column(name="voltagem", nullable=false)
	private float voltagem;
	@Column(name="consumo", nullable=false)
	private float consumo;
	@Column(name="temperatura", nullable=false)
	private float temperatura;
	@Column(name="cpftitular", nullable=false) // Quando eu deixo o name="" em camelCase o sistema não funciona
	private String cpfTitular;
	
	public Medidor(){}

	public Medidor(int id, boolean provisionado, Date dataMedicao, float voltagem, float consumo, float temperatura,
			String cpfTitular) {
		this.id = id;
		this.provisionado = provisionado;
		this.dataMedicao = dataMedicao;
		this.voltagem = voltagem;
		this.consumo = consumo;
		this.temperatura = temperatura;
		this.cpfTitular = cpfTitular;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isProvisionado() {
		return provisionado;
	}

	public void setProvisionado(boolean provisionado) {
		this.provisionado = provisionado;
	}

	public Date getDataMedicao() {
		return dataMedicao;
	}

	public void setDataMedicao(Date dataMedicao) {
		this.dataMedicao = dataMedicao;
	}

	public float getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
}
