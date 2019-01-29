package heranca.e.polimorfismo;

public class Editora {

	private String nome;
	private String endereco;

	public Editora(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Editora [nome=" + nome + ", endereco=" + endereco + "]";
	}

}
