package com.uliano.reflection.exercicio;

public class LoadClass {

	public static Class<?> loadClass(String nomeClasse/*, String tipoClasse*/) throws Exception {
		String caminho = FactoryClass.getCaminhoPasta() + "." + nomeClasse;
		Class<?> classe = null;
		try {
			classe = Class.forName(caminho);
			return classe;
		} catch (ClassNotFoundException e) {
			throw new Exception("A classe " + nomeClasse + " não foi encontrada dentro de " + FactoryClass.getCaminhoPasta());
		}
	}
}
