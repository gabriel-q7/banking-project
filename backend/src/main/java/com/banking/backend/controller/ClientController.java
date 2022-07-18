package com.banking.backend.controller;

import com.banking.backend.exception.ClientNotFoundException;
import com.banking.backend.model.Client;
import com.banking.backend.repository.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    //GET all
    @GetMapping
    public List<Client> findAll(){
        return null;
    }

    //GET id
    @GetMapping("/{id}")
    public Client findById(@PathVariable String id) throws ClientNotFoundException {
        return null;
    }

    //POST
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Client create(@RequestBody Client client){
        return null;
    }

    //PUT
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody Client client, @PathVariable String id){

    }

    //DELETE
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){

    }
}
