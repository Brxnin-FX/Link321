package atividade2;

public class Conta {
	
	 double saldoLimite=0;
	 double saldo=0;
	 int codigoIdentificacao;
	 
	 
	 //Construtor vazio
	 public Conta() {
		 
	 }
	 
	 
	 
	 //Gets and Sets
	 public double getSaldoLimite() {
			return saldoLimite;
		}


		public void setSaldoLimite(double saldoLimite) {
			this.saldoLimite = saldoLimite;
		}
	 
	 public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	 
	public int getCodigoIdentificacao() {
		return codigoIdentificacao;
	}
	public void setCodigoIdentificacao(int codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}
	
	//Metodo sacar 
	public double sacar(double valorDeSaque) {
		/*
		 * Essa verifica��o serve pra ver se o deposito que o usuario quer fazer
		 * nao � maior que o limite dele
		 * caso seja ele lan�ar� a Exception (ArithmeticException)
		 */
		if(valorDeSaque > saldoLimite) {
			throw new ArithmeticException("Valor desejado acima do limite!");
		}
		
		/*
		 * Essa outra verifica��o serve para ver se o valor que o usuario quer fazer de saque nao � maior 
		 * que o saldo dele
		 * caso seja ele lan�ara outra Exception do mesmo tipo (ArithmeticException)
		 * 
		 */
		if(valorDeSaque > saldo) {
			throw new ArithmeticException("Saldo Insuficiente");
		}
		//Aqui nos atualizamos o valor do saldo
		saldo = saldo - valorDeSaque;
		
		//Retorno do metodo que � o valor que ele deseja sacar
		return valorDeSaque;
	}
	
	
	//Metodo para fazer um deposito
	public void depositar(double ValorDeDeposito) {
		//Aqui ele pega 
		saldo = saldo + ValorDeDeposito;
	}
	

}
