package Caelum_4_5;

public class TestaEmpresa {

	 public static void main(String[]args){
	  Empresa em = new Empresa();
	  em.empregado = new Funcionario[5];
	  
	  Funcionario f1 = new Funcionario();
	  f1.nome = "Jo�o";
	  f1.salario = 1000;
	  f1.departamento = "Departamento de vendas";
	  em.adiciona(f1);
	  
	  Funcionario f2 = new Funcionario();
	  f2.nome = "Carlos";
	  f2.salario = 1700;
	  f2.departamento = "Departamento de fotos";
	  em.adiciona(f2);
	  
	  em.mostraEmpregados();
	  em.mostra();
	  
	  boolean contem(Funcionario f) {
		  
		}
	 }
	}