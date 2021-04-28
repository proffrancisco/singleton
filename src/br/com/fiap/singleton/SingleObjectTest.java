package br.com.fiap.singleton;

public class SingleObjectTest {

	public static void main(String[] args) {
		//SingleObject object = new SingleObject();	
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}

}
