package co.edu.unbosque.microservicioproveedor.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproveedor.model.Proveedorbogota;

public interface ProveedorbogotaDAO extends MongoRepository<Proveedorbogota, BigInteger> {

}
