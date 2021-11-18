package co.edu.unbosque.microservicioproductos.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproductos.model.ProductoCali;

public interface ProductoCaliDAO extends MongoRepository<ProductoCali, BigInteger> {

}
