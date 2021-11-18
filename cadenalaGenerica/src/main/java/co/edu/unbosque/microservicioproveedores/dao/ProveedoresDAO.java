package co.edu.unbosque.microservicioproveedores.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproveedores.model.Proveedor;

public interface ProveedoresDAO extends MongoRepository<Proveedor, BigInteger>{

}
