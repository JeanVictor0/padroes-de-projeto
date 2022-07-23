package one.innovation.facade;

import subSistema1.crm.CrmService;
import subSistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		CepApi cepApi = CepApi.getInstancia();
		String cidade = cepApi.recuperarCidade(cep);
		String estado = cepApi.recuperarEstado(cep);
				
		CrmService.gravarCliente(nome,cep, cidade, estado);
		
		
	}
}
