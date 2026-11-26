package pacote;

public class Moto extends Veiculo implements Inspecionavel{
	
	public Moto(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
			StatusVeiculo status) {
		super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
		// TODO Auto-generated constructor stub
	}


	private double cilindradas;
	/*pode ser inspencionado*/

	public double getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}

	
	public void realizarInspecao() {
		System.out.println("inspenção de moto");
		
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean possuiSeguroEspecial() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
