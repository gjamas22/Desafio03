package gft.br;

public class Avião extends Veiculos {

	public String tipo;
	public String uso;

	public Avião(String modelo, int velocidade, int passageiros, int combustivel, boolean isLigado, String tipo,
			String uso) {
		super(modelo, velocidade, passageiros, combustivel, isLigado);
		this.tipo = tipo;
		this.uso = uso;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public void abastecer(String qntd) {
		super.abastecer(Integer.parseInt(qntd));
	}

	public void acelerar() {
		if (this.isLigado == true) {

			this.velocidade += 100;

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
		System.out.println("O tipo do avião é :" + this.tipo + "\n O avião é de uso : " + this.uso);
	}
}
