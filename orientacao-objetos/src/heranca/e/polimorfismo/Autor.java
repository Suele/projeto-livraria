
public class Autor {

	String nome;
	Editora editora;

	public Autor(String nome, Editora editora) {
		this.nome = nome;
		this.editora = editora;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", editora=" + editora + "]";
	}

}
