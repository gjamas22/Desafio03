package gft.br;

public class Main {

	public static void main(String[] args) {

		Carro c1 = new Carro("Jeep Renegate", 50, 4, 40, true, "Jeep", 4, 2009);
		c1.ligar();
		c1.acelerar();
		c1.abastecer(50);
		c1.status();

		Avião c2 = new Avião("Boing 747", 200, 100, 200, true, "para turismo", "comercial");
		System.out.println("--------------------------------------------");
		c2.ligar();
		c2.acelerar();
		c2.abastecer(50);
		c2.status();

		Caminhão c3 = new Caminhão("Scania", 30, 3, 60, true, 230);
		System.out.println("-------------------------------------------");
		c3.ligar();
		c3.acelerar();
		c3.abastecer(50);
		c3.status();
	}
}
