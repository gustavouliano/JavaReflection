package com.uliano.reflection.exercicio;

public class FactoryClass {

	public static Object loadFromController(String nomeClasse) throws Exception {
		return LoadClassInstance.loadInstance(TrataValor.trataNomeClasseController(nomeClasse));
	}
	
	public static String getCaminhoPasta() {
		return "com.uliano.reflection.exercicio";
	}
	
}
