package heranca.e.polimorfismo;

public class Ebook extends Livro {

	public Ebook(String nome, double preco, String isbn, Autor autor) throws Throwable {
		super(nome, preco, isbn, autor);
	}

	@Override
	public boolean aplicaDescontoDe(double valorDoDesconto) {

		if (valorDoDesconto > 0 && valorDoDesconto <= 0.15) {

			double valorGeradoDoDesconto = this.getPreco() * valorDoDesconto;

			this.setPreco(this.getPreco() - valorGeradoDoDesconto);

			return true;
		} else {

			return false;
		}
	}
}
