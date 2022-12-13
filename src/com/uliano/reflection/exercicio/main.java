package com.uliano.reflection.exercicio;

public class main {

	public static void main(String[] args) throws Exception {
		Object produto = FactoryClass.loadFromController("/produto");
		System.out.println(produto);
	}

}
