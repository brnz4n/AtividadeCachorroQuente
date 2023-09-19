package vendaCachorroquente;

public class Adicionais {

	private boolean ketchup;
	private boolean maionese;
	private boolean batatafrita;
	private boolean ovo;
	public Adicionais(String nome, boolean ketchup, boolean maionese, boolean batatafrita, boolean ovo) {
		this.ketchup = ketchup;
		this.maionese = maionese;
		this.batatafrita = batatafrita;
		this.ovo = ovo;
	}
	
	public boolean isKetchup() {
		return ketchup;
	}
	public void setKetchup(boolean ketchup) {
		this.ketchup = ketchup;
	}
	public boolean isMaionese() {
		return maionese;
	}
	public void setMaionese(boolean maionese) {
		this.maionese = maionese;
	}
	public boolean isBatatafrita() {
		return batatafrita;
	}
	public void setBatatafrita(boolean batatafrita) {
		this.batatafrita = batatafrita;
	}
	public boolean isOvo() {
		return ovo;
	}
	public void setOvo(boolean ovo) {
		this.ovo = ovo;
	}
	
}
