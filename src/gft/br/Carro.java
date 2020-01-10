package gft.br;

public class Carro extends Veiculos {

	public String marca;
	public int porta;
	public int anos;

	public Carro(String modelo, int velocidade, int passageiros, int combustivel, boolean isLigado, String marca,
			int porta, int anos) {
		super(modelo, velocidade, passageiros, combustivel, isLigado);
		this.marca = marca;
		this.porta = porta;
		this.anos = anos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	public void abastecer(int qntdLitros) {
		super.abastecer(qntdLitros);

	}

	public void acelerar() {
		if (this.isLigado == true) {

			this.velocidade += 20;

			this.combustivel -= 1;

		} else

			System.out.println("Voce precisa ligar o veiculo primeiro");
	}

	public void ligar() {
		if (this.isLigado == true) {
			System.out.println("O veiculo esta ligado");
		} else {
			this.isLigado = true;
		}
	}

	public void desligar() {
		if (this.isLigado == false) {
			System.out.println("O veiculo esta desligado");
		} else {
			this.isLigado = false;
		}

	}

	public void status() {
		super.status();
		System.out.println("A marca do carro é :" + this.marca + "\n O carro possue " + this.porta + " portas "
				+ "\n O carro é do ano :" + this.anos);
	}
}
