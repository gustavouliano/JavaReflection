package com.curvello.reflection.aula01;

public class Main3 {

	public static void main(String[] args) 
			throws InstantiationException, 
			       IllegalAccessException, 
			       ClassNotFoundException{
		
		Class<?> pClass = Class.forName("com.curvello.reflection.aula01.Pessoa");
		
		@SuppressWarnings("deprecation")
		Pessoa p = (Pessoa)pClass.newInstance();
		p.setNome("Rodrigo");
		p.setEmail("rodrigo.curvello@ifc.edu.br");
		
		System.out.println(p instanceof Pessoa);
		System.out.println(p);
	}
}
