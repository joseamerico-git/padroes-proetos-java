package com.doichejunior.gof;

/*Singleton "preguiçoso"*/

public class SingletonLazy {
	
	private static SingletonLazy instancia;

	// Pulo do gato
	private SingletonLazy() {
		super();

	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
