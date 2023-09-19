package vendaCachorroquente;

public class CachorroQuente {
	
	public String bebida;
	public String queijo;
	public String proteina;
	
	public CachorroQuente(String proteina, String queijo,String bebida){
		this.bebida = bebida;
		this.queijo = queijo;
		this.proteina = proteina;

	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getQueijo() {
		return queijo;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}
	
}