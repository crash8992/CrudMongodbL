package com.example.CrudMongodbL.service;

import com.example.CrudMongodbL.entity.Cliente;
import com.example.CrudMongodbL.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerTodosClientes(){
        return clienteRepository.findAll();
    }

    public  Cliente obtenerClientePorId(String identificacion){
        return clienteRepository.findById(identificacion).orElse(null);
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(String identificacion){
        clienteRepository.deleteById(identificacion);
    }

}
