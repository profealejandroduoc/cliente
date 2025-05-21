package com.comunicacion.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comunicacion.cliente.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
