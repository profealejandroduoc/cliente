// controller/ClienteController.java
package com.comunicacion.cliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.comunicacion.cliente.model.Cliente;
import com.comunicacion.cliente.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    /*
     * public ClienteController(ClienteService service) {
     * this.service = service;
     * }
     */

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes() {
        List<Cliente> clientes = clienteService.listarClientes();
        if (clientes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(clientes, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Cliente> postCliente(@RequestBody Cliente cliente) {
        Cliente nuevo;
        try {
            nuevo = clienteService.guardarCliente(cliente);
            return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.CONFLICT); // 409 si los clientes están duplicados
        }
       

    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return clienteService.findById(id).orElse(null);
    }

}
