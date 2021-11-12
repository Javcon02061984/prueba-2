package co.edu.unbosque.microservicioproducto.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproducto.model.Productomedellin;


public interface ProductomedellinDAO extends MongoRepository<Productomedellin, BigInteger> {

}
