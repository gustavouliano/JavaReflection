package com.curvello.reflection.aula01;

public class Main2 {

	public static void main(String[] args) 
			throws InstantiationException, 
			       IllegalAccessException{
		
		Pessoa p = new Pessoa();
		Class<? extends Pessoa> pClass = p.getClass();
		
		@SuppressWarnings("deprecation")
		Pessoa p1 = pClass.newInstance();
		p1.setNome("Rodrigo");
		p1.setEmail("rodrigo.curvello@ifc.edu.br");
		
		System.out.println(p1 instanceof Pessoa);
		System.out.println(p1);
	}
}
