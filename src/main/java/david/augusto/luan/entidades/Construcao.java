package david.augusto.luan.entidades;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Construcao implements Commission {

	private double area;
	private double precoArea;

	public abstract String getDatos();

	public void printDatos() {
		System.out.println("");
	}

	public abstract double gerPrecoTotal();
}
