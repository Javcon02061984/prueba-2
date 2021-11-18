package co.edu.unbosque.microservicioproductos.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproductos.model.ProductoMedellin;

public interface ProductoMedellinDAO extends MongoRepository<ProductoMedellin, BigInteger> {

}
