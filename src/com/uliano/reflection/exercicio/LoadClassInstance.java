package com.uliano.reflection.exercicio;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LoadClassInstance {

	public static Object loadInstance(String nomeClasse) throws Exception{
		Class<?> classe = LoadClass.loadClass(nomeClasse);
		Constructor<?> constructor = null;
		try {
			constructor = classe.getDeclaredConstructor();
			Object obj = constructor.newInstance();
			return obj;
		} catch (NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			throw new Exception("Não foi possível instanciar a classe " + nomeClasse);
		}
	}
}
