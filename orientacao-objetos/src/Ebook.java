
public class Ebook extends Livro {

	private String waterMark;

	public Ebook(String nome, double preco, String isbn, Autor autor) {
		super(nome, preco, isbn, autor);
		// TODO Auto-generated constructor stub
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
