package facade;

public class Facade {
	
	//integrações com subsistemas
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, nome, cep);
	}

}
