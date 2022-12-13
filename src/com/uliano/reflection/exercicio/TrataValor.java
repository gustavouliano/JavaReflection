package com.uliano.reflection.exercicio;

public class TrataValor {
	
	public static String trataNomeClasse(String valor) throws Exception {
		if (valor.length() == 0 || (valor.length() == 1 && valor.charAt(0) == '/')) {
			throw new Exception("Nome da classe passado inválido");
		}
		if (valor.charAt(0) == '/') {
			valor = valor.substring(1);
		}
		valor = valor.substring(0, 1).toUpperCase() + valor.substring(1);
		
		return valor;
	}
	
	public static String trataNomeClasseController(String valor) throws Exception {
		return trataNomeClasse(valor).concat("Controller");
	}
}
