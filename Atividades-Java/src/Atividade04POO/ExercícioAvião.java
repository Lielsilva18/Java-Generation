package Atividade04POO;

public class ExercícioAvião {
		
	//declaração dos atributos da classe
	
	private String tipo;
	private String nomePiloto;
	private String cor;
	private int quantidadeAssentos;
		
		//declaração do método construtor
	public ExercícioAvião(String tipo,String nomePiloto,String cor, int quantidadeAssentos)
	{
		this.tipo = tipo;
		this.nomePiloto = nomePiloto;
		this.cor = cor;
		this.quantidadeAssentos = quantidadeAssentos;
	}
		//declaração dos demais métodos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\nTipo de avião: "+tipo+"."+"\nPilotado pelo capitão: "+nomePiloto+"."+"\nPintado com a cor: "
		+ ""+cor+"."+"\nPossui: "+quantidadeAssentos+" assentos.");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadeAssentos() {
		return quantidadeAssentos;
	}

	public void setQuantidadeAssentos(int quantidadeAssentos) {
		this.quantidadeAssentos = quantidadeAssentos;
		
	}
}
