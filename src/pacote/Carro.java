package pacote;

public class Carro extends Veiculo implements Avaliavel{
	public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem,
			StatusVeiculo status) {
		super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
		// TODO Auto-generated constructor stub
	}

	private int Quant_portas;
	/*Receber avaliação*/

	public int getQuant_portas() {
		return Quant_portas;
	}

	public void setQuant_portas(int quant_portas) {
		Quant_portas = quant_portas;
	}

	
	public void avaliar(int nota) {
		// TODO Auto-generated method stub
		
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
