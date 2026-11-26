package pacote;

public class Van extends Veiculo implements Inspecionavel{
	
	private int QuantidadeMaxima;
	
	public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
			StatusVeiculo status) {
		super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
	}

	
	public int getQuantidadeMaxima() {
		return QuantidadeMaxima;
	}

	public void setQuantidadeMaxima(int quantidadeMaxima) {
		QuantidadeMaxima = quantidadeMaxima;
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
