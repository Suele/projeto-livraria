package heranca.e.polimorfismo;

public class RegistraCompras {
	public static void main(String[] args) throws Throwable {

		Editora editora = new Editora("Casa do Código", "Rua dos Guararapes");

		Autor autor = new Autor("Paulo Silveira", editora);

		Ebook ebook = new Ebook("Orientação a Objetos", 100.00, "123.456.789.00", autor);

		LivroImpresso livroImpresso = new LivroImpresso("Orientação a Objetos", 100, "123.456.789.00", autor);

		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adiciona(ebook);
		carrinhoDeCompras.adiciona(livroImpresso);

		System.out.println("Total no Carrinho de Compras: " + carrinhoDeCompras.getTotal());
	}
}
