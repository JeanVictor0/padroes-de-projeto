package one.innovation.singleton;

public class Teste {
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		SingletonEager eager = SingletonEager.getInstancia();
		
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
	}
}
