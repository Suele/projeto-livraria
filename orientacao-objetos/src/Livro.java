
public class Livro {

	private String nome;
	private String descricao;
	private double preco;
	private String isbn;
	private int numeroDePaginas;
	private Autor autor;

	public Livro(String nome, String descricao, double preco, String isbn, int numeroDePaginas, Autor autor) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.isbn = isbn;
		this.numeroDePaginas = numeroDePaginas;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", isbn=" + isbn
				+ ", numeroDePaginas=" + numeroDePaginas + ", autor=" + autor + "]";
	}

}
