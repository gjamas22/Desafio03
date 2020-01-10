package gft.br;

public class Caminhão extends Veiculos {

	public int pesoCarga;

	public Caminhão(String modelo, int velocidade, int passageiros, int combustivel, boolean isLigado, int pesoCarga) {
		super(modelo, velocidade, passageiros, combustivel, isLigado);
		this.pesoCarga = pesoCarga;
	}

	public int getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(int pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public void abastecer(float qtd) {
		super.abastecer(Math.round(qtd));
	}

	public void acelerar() {
		if (this.isLigado == true) {

			this.velocidade += 40;

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
		System.out.println("O peso da carga do caminhão é " + this.pesoCarga);
	}
}
