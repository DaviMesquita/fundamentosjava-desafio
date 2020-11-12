package dominio;

public class Pessoa {
	public int id;
	public String nome;
	public float mensalidade;
	public boolean bolsista;
	
	public Pessoa() {
		this.nome = "donald";
	}
	
	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}
	
	public Pessoa(String nome, float mensalidade) {
		this(nome);
		this.mensalidade = mensalidade;
	}
	
	public void imprimir() {
		if (this.bolsista) {
			System.out.printf("%s | %.2f | bolsista | %.2f | *** %d \n\n", this.nome, this.mensalidade, (this.mensalidade/2), this.id );
		}else {
			System.out.printf("%s | %.2f | pagante | %.2f | *** %d \n\n", this.nome, this.mensalidade, this.mensalidade, this.id );
		}
	}
	
	@Override
	public String toString() {
		if (this.bolsista) {
			return String.format("%s | %.2f | bolsista | %.2f \n", this.nome, this.mensalidade, (this.mensalidade/2));
		}else {
			return String.format("%s | %.2f | pagante | %.2f \n", this.nome, this.mensalidade, this.mensalidade);
		}
	}
		
}