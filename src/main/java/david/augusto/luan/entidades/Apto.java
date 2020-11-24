package david.augusto.luan.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Apto extends Construcao {

	private int nQuartos;

	public Apto(double a, double p) {

	}

	@Override
	public void setVendas(double sales) {

	}

	@Override
	public String getDatos() {
		return this.nQuartos + " Quartos";
	}

	@Override
	public void printDatos() {
		super.printDatos();
	}

	@Override
	public double getPrecoTotal() {
		return super.getPrecoTotal() * this.nQuartos;
	}

}
