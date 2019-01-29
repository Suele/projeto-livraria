package heranca.e.polimorfismo;
public class Teste {
	public static void main(String[] args) throws Throwable {

		Editora editora = new Editora("Casa do Código", "Rua dos Guararapes");
		Autor autor = new Autor("Paulo Silveira", editora);

		Livro livro = new Livro("Estrutura de Dados", 120.90, "123.345.234.90", autor);

		Ebook ebook = new Ebook("Orientação a objetos", 67.90, "123.453.567.00", autor);

		// System.out.println(livro);
		System.out.println(ebook);
		System.out.println(ebook.getPreco());
		System.out.println(ebook.aplicaDescontoDe(0.15));
		System.out.println(ebook.getPreco());
	}
}
