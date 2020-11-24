package david.augusto.luan.entidades;

public class Loja extends Construcao {

	private double sales;

	@Override
	public String getDatos() {
		return "Vendas: R$ %d.2f" + sales;
	}

	@Override
	public void setVendas(double sales) {
		setVendas(sales);
	}

	@Override
	public void printDatos() {
		super.printDatos();
	}

	@Override
	public double getPrecoTotal() {
		return super.getPrecoTotal() + sales * COMMISION_RATE;
	}

}
