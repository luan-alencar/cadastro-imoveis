package david.augusto.luan.entidades;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Escritorio extends Apto {

	private double sales;
	Loja l = new Loja();

	@Override
	public void setVendas(double sales) {
		super.setVendas(this.sales + sales);
	}

	@Override
	public String getDatos() {
		return "Vendas:  R$ %d.2f" + sales +
				"Preço total:  R$ %d.2f" + getPrecoTotal();
	}

	@Override
	public double getPrecoTotal() {
		return super.getPrecoTotal() * l.getPrecoTotal();
	}

}
