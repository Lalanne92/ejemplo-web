package com.example.demo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente {

	public List<Cliente> verClientes(){
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente("Camilo", "Lalanne"));
		lista.add(new Cliente("Natalio", "Martinez"));
		lista.add(new Cliente("Fabricio", "Rojas"));
		lista.add(new Cliente("Federico", "Palacio"));
		return lista;
	}
	
}
