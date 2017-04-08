package swt.template;

public class Pessoaa {

	private String nome, sexo, cidade;
	
	private String[] toarray() {
		return new String[] { getNome(), getSexo(), getCidade()  };
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	
}
