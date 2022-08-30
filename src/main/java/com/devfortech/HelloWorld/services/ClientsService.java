package com.devfortech.HelloWorld.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.devfortech.HelloWorld.dto.ClientsDTO;

@Service
public class ClientsService {

	public ArrayList<ClientsDTO> findAll() {
		ArrayList<ClientsDTO> clients = new ArrayList<ClientsDTO>(); 
		clients.add(new ClientsDTO(1L, "Junior", "02001761295", "teste@teste.com", "avenida rotar club",
		"teste", "teste", "teste"));
		clients.add(new ClientsDTO(1L, "Sott", "02001761295", "teste@teste.com", "avenida rotar club",
				"teste", "teste", "teste"));
		return clients;
	}
	
	public ClientsDTO findById(Long id) {
		ClientsDTO client = new ClientsDTO(id, "Junior", "02001761295", "teste@teste.com", "avenida rotar club",
				"teste", "teste", "teste");
		return client;
	}

	public ClientsDTO insert(ClientsDTO dto) {
		ClientsDTO client = new ClientsDTO(1L, dto.getName(), dto.getCpf(), "teste@teste.com", "avenida rotar club",
				"teste", "teste", "teste");
		return client;
	}

	public ClientsDTO update(Long id, ClientsDTO dto) {
		ClientsDTO client = new ClientsDTO(id, dto.getName(), dto.getCpf(), "teste@teste.com", "avenida rotar club",
				"teste", "teste", "teste");
		return client;
	}
	public void delete(Long id) {

	}
}
