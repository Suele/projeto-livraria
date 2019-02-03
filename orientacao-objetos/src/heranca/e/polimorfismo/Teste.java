package heranca.e.polimorfismo;

public class Teste {
	public static void main(String[] args) throws Throwable {

		Editora editora = new Editora("Casa do Código", "Rua dos Guararapes");
		Autor autor = new Autor("Paulo Silveira", editora);

		Livro livroImpresso = new LivroImpresso("Estrutura de Dados", 120.90, "123.345.234.90", autor);

		Livro ebook = new Ebook("Orientação a objetos", 67.90, "123.453.567.00", autor);

		Livro miniLivro = new MiniLivro("Mini Javascript", 89.99, "123.435.987.23", autor);

		// System.out.println(livroImpresso);
		System.out.println(ebook);
		System.out.println(ebook.getPreco());
		System.out.println(ebook.aplicaDescontoDe(0.15));
		System.out.println(ebook.getPreco());

		// MiniLivro
		System.out.print(miniLivro);
		System.out.println(miniLivro.getPreco());
		System.out.println(miniLivro.aplicaDescontoDe(0.30));
		System.out.print(miniLivro.getPreco());
	}
}
