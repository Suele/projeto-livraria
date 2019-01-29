
public class Livro {

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
			System.out.println("Livro Criado com sucesso.");
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

	public boolean aplicaDescontoDe(int valorDoDesconto) {
		if (valorDoDesconto > 0 && valorDoDesconto < 50) {

			this.preco = ((this.preco * valorDoDesconto) / 100);
			return true;
		} else {

			return false;
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