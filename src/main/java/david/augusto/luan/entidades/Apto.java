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
		return "O número de quartos é são: " + this.nQuartos;
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
