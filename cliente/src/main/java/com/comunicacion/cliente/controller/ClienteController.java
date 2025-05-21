// controller/ClienteController.java
package com.comunicacion.cliente.controller;


import org.springframework.web.bind.annotation.*;

import com.comunicacion.cliente.model.Cliente;
import com.comunicacion.cliente.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }
}
