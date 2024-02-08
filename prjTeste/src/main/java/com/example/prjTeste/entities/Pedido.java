package com.example.prjTeste.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
	//atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "data")
	private String data;
	
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "cliente")
	private Long cliente;

	//construtor vazio
	public Pedido() {
		
	}
	// construtor com parametros
	public Pedido(Long id, String data, Double valor, Long cliente) {
		super();
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.cliente = cliente;
	}
	
	//métodos de acesso
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Long getCliente() {
		return cliente;
	}
	
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
}