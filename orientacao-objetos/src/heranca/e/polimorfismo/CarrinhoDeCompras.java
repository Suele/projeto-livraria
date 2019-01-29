package heranca.e.polimorfismo;

public class CarrinhoDeCompras {

	private double total;

	public void adiciona(Livro livro) {
		System.out.println("Foi adicionado o livro: " + livro);
		this.total += livro.getPreco();
	}

	public double getTotal() {
		return total;
	}

}
