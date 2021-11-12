package co.edu.unbosque.microserviciocliente.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciocliente.model.Clientemedellin;

public interface ClientemedellinDAO extends MongoRepository<Clientemedellin, BigInteger> {

}
