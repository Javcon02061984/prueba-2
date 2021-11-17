package co.edu.unbosque.microservicioclientes.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioclientes.model.Clientes;

// Parámetros de MongoRepository --> <DTO, tipo de dato de la PK>
public interface ClienteDAO extends MongoRepository<Clientes, Integer>{
	
}
