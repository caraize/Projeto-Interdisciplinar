
public class Cliente extends Pessoa{

	private double peso, altura;
	private int idade;
	private boolean pagMensal;

	public Cliente(String nome, String cpf, String sexo, double peso, double altura, int idade, boolean pagMensal) {
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
		this.pagMensal = pagMensal;
	}



	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean getPagMensal() {
		return pagMensal;
	}

	public String pagMensal() {
		if (this.pagMensal == true) {
			return "Pago";
		}
		return "N�o pago";

	}

	public void setPagMensal(boolean pagMensal) {
		this.pagMensal = pagMensal;
	}

        @Override
	public String toString() {
		return "Cliente [nome: " + super.getNome().toUpperCase() + " | cpf: " + super.getCpf() + " | sexo: " + super.getSexo()
				+ " | peso: " + peso + " | altura: " + altura + " | idade: " + idade + " | pagamento Mensal: "
				+ pagMensal() + "]"
				+ "\n---------------------------------------------------------------------------------------------------------------\n";
	}

}
