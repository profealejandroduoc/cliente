package com.comunicacion.cliente.service;

// service/ClienteService.java


import org.springframework.stereotype.Service;

import com.comunicacion.cliente.model.Cliente;
import com.comunicacion.cliente.repository.ClienteRepository;

import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public Optional<Cliente> findById(Long id) {
        return repo.findById(id);
    }
}

