package com.example.salesManagementSystem.service.serviceImplementation;

import com.example.salesManagementSystem.entity.Client;
import com.example.salesManagementSystem.repository.ClientRepo;
import com.example.salesManagementSystem.service.ClientService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepository;


    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found with id " + id));
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Long id, Client client) {
        Client existingClient = getClientById(id);
        return clientRepository.save(existingClient);    }

    @Override
    public void deleteClient(Long id) {
        Client client = getClientById(id);
        clientRepository.delete(client);
    }
}
