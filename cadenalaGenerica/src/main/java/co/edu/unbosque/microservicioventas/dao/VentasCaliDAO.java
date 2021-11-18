package co.edu.unbosque.microservicioventas.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioventas.model.VentasCali;

public interface VentasCaliDAO extends MongoRepository<VentasCali, BigInteger> {

}
