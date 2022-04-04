package com.fabriciocosta.pessoa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String cpf;
	private double salarioDiario;
	
	public Pessoa() {}
	
	public Pessoa(long id, String nome, String cpf, double salarioDiario) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.salarioDiario = salarioDiario;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalarioDiario() {
		return salarioDiario;
	}
	public void setSalarioDiario(double salarioDiario) {
		this.salarioDiario = salarioDiario;
	}
	
	
}
