package david.augusto.luan.entidades;

import david.augusto.luan.interfaces.Commission;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Construcao implements Commission {

	private double area;
	private double precoArea;

	public String getDatos() {
		return "O valor da área é de: " + area +
				" e o preço da Área: R$ %d.2f" + precoArea +
				" e preço total é de R$ %d.2f" + getPrecoTotal();
	}

	public void printDatos() {
		System.out.printf("O valor da área é de: " + area +
				" e o preço da Área: R$ %d.2f" + precoArea);
	}

	public double getPrecoTotal() {
		double total = area * 2;
		return total * precoArea;
	}
}
