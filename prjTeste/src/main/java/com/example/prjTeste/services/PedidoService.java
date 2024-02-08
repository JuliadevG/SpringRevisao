package com.example.prjTeste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.prjTeste.entities.Pedido;
import com.example.prjTeste.repositories.PedidoRepository;

@Service
public class PedidoService {
	private final PedidoRepository pedidoRepository;
	
	@Autowired
	public PedidoService (PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}

	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public List<Pedido> getAllPedidos(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidoById(Long id) {
		return pedidoRepository.findById(id).orElse(null);
	}
	
	public void deletePedido(Long id) {
		pedidoRepository.deleteById(id);
	}
}