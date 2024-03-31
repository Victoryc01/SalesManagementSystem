package com.example.salesManagementSystem.service;

import com.example.salesManagementSystem.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    Client getClientById(Long id);
    Client createClient(Client client);
    Client updateClient(Long id, Client client);
    void deleteClient(Long id);
}
