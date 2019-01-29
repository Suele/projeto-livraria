package heranca.e.polimorfismo;

public class LivroImpresso extends Livro {

	public LivroImpresso(String nome, double preco, String isbn, Autor autor) throws Throwable {
		super(nome, preco, isbn, autor);
	}

	public double gettaxaDeImpressao() {
		return super.getPreco() * 0.05;
	}
}
