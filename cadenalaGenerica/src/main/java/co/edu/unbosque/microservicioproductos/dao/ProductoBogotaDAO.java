package co.edu.unbosque.microservicioproductos.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproductos.model.ProductoBogota;

public interface ProductoBogotaDAO extends MongoRepository<ProductoBogota, BigInteger> {

}
