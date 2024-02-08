package com.example.prjTeste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prjTeste.entities.Pedido;
import com.example.prjTeste.services.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	private final PedidoService pedidoService;
	
	@Autowired
	public PedidoController (PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@PostMapping
	public Pedido createProduct(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}
	@GetMapping("/{id}")
	public Pedido getPedido(@PathVariable Long id) {
		return pedidoService.getPedidoById(id);
	}
	
	@GetMapping
	public List<Pedido> getAllPedidos(){
		return pedidoService.getAllPedidos();
	}
	
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Long id) {
		pedidoService.deletePedido(id);
	}
}