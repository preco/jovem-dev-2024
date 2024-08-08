package dinamica;
import java.math.BigDecimal;

public class Funcionario {
	private String nome;
	private DepartamentoEnum cargo;
	private BigDecimal salario;
	
	public Funcionario(String nome, DepartamentoEnum cargo, BigDecimal salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DepartamentoEnum getCargo() {
		return cargo;
	}

	public void setCargo(DepartamentoEnum cargo) {
		this.cargo = cargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}
