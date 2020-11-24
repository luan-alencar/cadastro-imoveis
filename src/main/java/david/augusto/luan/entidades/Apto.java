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
		// TODO
	}

	@Override
	public void setVendas(double sales) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getDatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrecoTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
