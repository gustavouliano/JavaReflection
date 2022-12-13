package com.uliano.reflection.exercicio;

public class ProdutoController {

	private int valor;
	
	public ProdutoController() {
		
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoController [valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}
	
}
