
public abstract class Funcionarios {

	private String nome;
	private String cpf;
	private double salario;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	
}
