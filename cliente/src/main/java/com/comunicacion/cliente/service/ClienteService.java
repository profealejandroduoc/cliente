package com.comunicacion.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;

// service/ClienteService.java


import org.springframework.stereotype.Service;

import com.comunicacion.cliente.model.Cliente;
import com.comunicacion.cliente.repository.ClienteRepository;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository repo) {
        this.clienteRepository = repo;
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }
}

