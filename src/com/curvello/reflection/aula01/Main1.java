package com.curvello.reflection.aula01;

public class Main1 {

	public static void main(String[] args) 
			throws InstantiationException, 
				   IllegalAccessException {
		
		Class<Pessoa> pClass = Pessoa.class;
		
		@SuppressWarnings("deprecation")
		Pessoa p = pClass.newInstance();
		p.setNome("Rodrigo");
		p.setEmail("rodrigo.curvello@ifc.edu.br");
		
		System.out.println(p instanceof Pessoa);
		System.out.println(p);
	}
}
