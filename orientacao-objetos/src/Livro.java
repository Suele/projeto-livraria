
public class Livro {

	protected String nome;
	protected String descricao;
	protected double preco;
	protected String isbn;
	protected int numeroDePaginas;
	protected Autor autor;

	public Livro(String nome, double preco, String isbn, Autor autor) {
		this.nome = nome;
		this.preco = preco;
		this.isbn = isbn;
		this.autor = autor;
	}

	public double aplicaDescontoDe(int valor) {
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
