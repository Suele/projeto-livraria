
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

	public double desconto(int valor) {
		if (valor > 0 && valor < 50) {

			return ((this.preco * valor) / 100);
		} else {

			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {

		Livro livro = (Livro) obj;

		if (this.nome != livro.nome && this.autor != livro.autor) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", isbn=" + isbn
				+ ", numeroDePaginas=" + numeroDePaginas + ", autor=" + autor + "]";
	}

}
