package gft.br;

public class Veiculos {
	protected String modelo;
	protected int velocidade;
	protected int passageiros;
	protected int combustivel;
	protected boolean isLigado;

	public Veiculos(String modelo, int velocidade, int passageiros, int combustivel, boolean isLigado) {
		super();
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.passageiros = passageiros;
		this.combustivel = combustivel;
		this.isLigado = isLigado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public void abastecer(int qntdLitros) {
		this.combustivel += qntdLitros;
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
		System.out.println("O modelo do veiculo é " + this.modelo + "\n A velocidade do veiculo é :" + this.velocidade
				+ " km " + "\n O número de passageiros é de :" + this.passageiros + "\n Seu combustivel é de :"
				+ this.combustivel + " litros");
	}
}
