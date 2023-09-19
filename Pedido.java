package vendaCachorroquente;

public class Pedido {
	private Aluno aluno;
	private CachorroQuente CachorroQuente[];
	private Adicionais Adicional;
	
	public Pedido(Aluno aluno, CachorroQuente cachorroQuente[], Adicionais Adicional) {
		this.aluno = aluno;
		this.CachorroQuente = cachorroQuente;
		this.Adicional = Adicional;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public CachorroQuente[] getCachorroQuente() {
		return CachorroQuente;
	}

	public void setCachorroQuente(CachorroQuente[] cachorroQuente) {
		CachorroQuente = cachorroQuente;
	}

	public Adicionais getAdicional() {
		return Adicional;
	}

	public void setAdicional(Adicionais adicional) {
		Adicional = adicional;
	}
	
}