package co.edu.unbosque.microserviciocliente.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciocliente.model.Clientecali;

public interface ClientecaliDAO extends MongoRepository<Clientecali, BigInteger> {

}
