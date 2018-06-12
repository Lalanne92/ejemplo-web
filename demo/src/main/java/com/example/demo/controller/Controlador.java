package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Cliente;
import com.example.demo.service.ICliente;

@RestController
@RequestMapping("/api/")
public class Controlador {
	
	@Autowired
	private ICliente clienteService;
	
	@GetMapping("clientes")
	public List<Cliente> verClientes(){
		return clienteService.verClientes();
	}

}
