
public class Teste {
	public static void main(String[] args) throws Throwable {

		Editora editora = new Editora("Casa do Código", "Rua dos Guararapes");
		Autor autor = new Autor("Paulo Silveira", editora);

		Livro livro = new Livro("Estrutura de Dados", 120.90, "123.345.234.90", autor);

		System.out.println(livro);
	}
}
