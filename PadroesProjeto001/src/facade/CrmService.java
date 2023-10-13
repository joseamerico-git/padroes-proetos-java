package facade;

public class CrmService {
	
	//Criando o construtor estático para garantir que não seja instanciado e sim conumir os métodos estátcos.
	private CrmService() {
		super();
		
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM");
		System.out.println("Nome: "+ nome);
		System.out.println("CEP: "+ cep);
		System.out.println("Cidade: "+ cidade);
		System.out.println("ESTADO: "+ estado);
		
	}

}
