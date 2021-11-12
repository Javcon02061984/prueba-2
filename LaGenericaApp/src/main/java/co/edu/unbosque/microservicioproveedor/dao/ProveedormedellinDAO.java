package co.edu.unbosque.microservicioproveedor.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproveedor.model.Proveedormedellin;

public interface ProveedormedellinDAO extends MongoRepository<Proveedormedellin, BigInteger> {

}
