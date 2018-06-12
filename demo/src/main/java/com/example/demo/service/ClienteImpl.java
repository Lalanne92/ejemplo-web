package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.Cliente;
import com.example.demo.pojo.ListaCliente;

@Service
public class ClienteImpl implements ICliente{

	
	private ListaCliente listaService = new ListaCliente();
	
	@Override
	public List<Cliente> verClientes() {
		return listaService.verClientes();
	}

}
