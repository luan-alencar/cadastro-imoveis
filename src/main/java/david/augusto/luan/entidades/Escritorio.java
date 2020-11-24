package david.augusto.luan.entidades;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Escritorio extends Apto {

	private double sales;

	@Override
	public void setVendas(double sales) {
		super.setVendas(this.sales + sales);
	}

	@Override
	public String getDatos() {
		// TODO Auto-generated method stub
		return super.getDatos();
	}

	@Override
	public double getPrecoTotal() {
		// TODO Auto-generated method stub
		return super.getPrecoTotal();
	}

}
