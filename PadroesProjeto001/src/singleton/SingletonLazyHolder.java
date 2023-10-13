package singleton;

public class SingletonLazyHolder {
	
	//classe criada para encapsular a instância
	private static class InstanceHolder {
	private static SingletonLazyHolder instancia= new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
