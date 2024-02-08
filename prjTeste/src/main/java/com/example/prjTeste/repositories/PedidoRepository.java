package com.example.prjTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prjTeste.entities.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, Long> { 
}