package com.example.CrudMongodbL.controller;

import com.example.CrudMongodbL.entity.Cliente;
import com.example.CrudMongodbL.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes/v1")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> obtenerTodosClientes(){
        return clienteService.obtenerTodosClientes();
    }

    @GetMapping("/{identificacion}")
    public Cliente obtenerClientePorId(@PathVariable String identificacion){
        return clienteService.obtenerClientePorId(identificacion);
    }

    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping("/{identificacion}")
    public void eliminarCliente(@PathVariable String identificacion){
        clienteService.eliminarCliente(identificacion);
    }
}
