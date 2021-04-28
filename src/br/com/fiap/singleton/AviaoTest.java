package br.com.fiap.singleton;

public class AviaoTest {
	public static void main(String[] args) {
		agendarAssento("A1");
		agendarAssento("A1");
	}
	
	private static void agendarAssento(String assento) {
		Aviao a = Aviao.getInstance();
		System.out.println(a.bookAssento(assento));
	}

}
