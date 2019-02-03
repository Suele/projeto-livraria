package heranca.e.polimorfismo;

public class LivroImpresso extends Livro {

	public LivroImpresso(String nome, double preco, String isbn, Autor autor) throws Throwable {
		super(nome, preco, isbn, autor);
	}

	public double gettaxaDeImpressao() {
		return super.getPreco() * 0.05;
	}

	@Override
	public boolean aplicaDescontoDe(double valorDoDesconto) {

		if (valorDoDesconto > 0 && valorDoDesconto < 0.30) {

			double desconto = getPreco() * valorDoDesconto;
			setPreco(getPreco() - desconto);
			return true;
		} else {
			return false;
		}
	}
}
