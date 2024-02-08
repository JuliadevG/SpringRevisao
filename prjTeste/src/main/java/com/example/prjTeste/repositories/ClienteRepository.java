package com.example.prjTeste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prjTeste.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> { 
}