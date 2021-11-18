package co.edu.unbosque.microservicioventas.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioventas.model.VentasMedellin;

public interface VentasMedellinDAO extends MongoRepository<VentasMedellin, BigInteger> {

}
