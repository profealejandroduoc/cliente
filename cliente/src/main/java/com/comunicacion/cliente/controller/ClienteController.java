// controller/ClienteController.java
package com.comunicacion.cliente.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.comunicacion.cliente.model.Cliente;
import com.comunicacion.cliente.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    /*public ClienteController(ClienteService service) {
        this.service = service;
    }*/

  

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return clienteService.findById(id).orElse(null);
    }
}
