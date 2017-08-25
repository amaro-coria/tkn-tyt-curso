package com.teknei.main.beans;

public class MaquinaDeDespidosPerez implements MaquinaDeDespidos{
	
	private MaquinaDeSaludos maquinaDeSaludos;

	public String despedido() {
		return maquinaDeSaludos.saluda() + " y estas despedido!"; 
	}

	public void setMaquinaDeSaludos(MaquinaDeSaludos maquinaDeSaludos){
		this.maquinaDeSaludos = maquinaDeSaludos;
	}
	
	
}
