package com.usuario.service.modelos;

public class Carro {

	private String marca;
	private String modelo;
	private int usuariId;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getUsuariId() {
		return usuariId;
	}

	public void setUsuariId(int usuariId) {
		this.usuariId = usuariId;
	}

	public Carro() {
		super();
	}

}
