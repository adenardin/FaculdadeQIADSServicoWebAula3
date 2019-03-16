package br.edu.qi.dto;

public class Nota {

	private int codDisciplina;
	private String ra;
	private int anoSem;
	private float n1;
	private float n2;
	private float exame;
	private boolean aprovado;
	
	public Nota() {
	}
	
	public Nota(int codDisciplina, String ra, 
			int anoSem, float n1, float n2, 
			float exame, boolean aprovado) {
		super();
		this.codDisciplina = codDisciplina;
		this.ra = ra;
		this.anoSem = anoSem;
		this.n1 = n1;
		this.n2 = n2;
		this.exame = exame;
		this.aprovado = aprovado;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public int getAnoSem() {
		return anoSem;
	}

	public void setAnoSem(int anoSem) {
		this.anoSem = anoSem;
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getExame() {
		return exame;
	}

	public void setExame(float exame) {
		this.exame = exame;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
