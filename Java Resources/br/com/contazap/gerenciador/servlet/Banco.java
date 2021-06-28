package br.com.contazap.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	
	
	//Estamos "gravando" essas duas empresas para que toda vez que o servidor subir elas já estejam cadastradas.
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Google");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Amazon");
		
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
			Banco.lista.add(empresa);	
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
