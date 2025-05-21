package com.comunicacion.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;

// service/ClienteService.java

import org.springframework.stereotype.Service;

import com.comunicacion.cliente.model.Cliente;
import com.comunicacion.cliente.repository.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }



}
