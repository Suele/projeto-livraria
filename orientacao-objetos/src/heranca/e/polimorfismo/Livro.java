package heranca.e.polimorfismo;

public abstract class Livro {

	private String nome;
	private String descricao;
	private double preco;
	private String isbn;
	private int numeroDePaginas;
	private Autor autor;

	public Livro(String nome, double preco, String isbn, Autor autor) throws Throwable {
		if ((nome != null && nome.length() > 5) && preco > 0 && (isbn != null && isbn.length() == 14)
				&& autor != null) {
			this.nome = nome;
			this.preco = preco;
			this.isbn = isbn;
			this.autor = autor;
		} else {
			throw new Throwable("Preencha os dados corretamente.");
		}

	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public abstract boolean aplicaDescontoDe(double valorDoDesconto);

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
		return "\nLivro >>> nome: " + nome + ", descricao: " + descricao + ", preco: " + preco + ", isbn: " + isbn
				+ ", numeroDePaginas: " + numeroDePaginas + "\n" + autor + "\n";
	}

}
