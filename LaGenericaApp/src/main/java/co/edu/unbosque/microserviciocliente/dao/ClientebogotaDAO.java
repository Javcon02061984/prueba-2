package co.edu.unbosque.microserviciocliente.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciocliente.model.Clientebogota;


public interface ClientebogotaDAO extends MongoRepository<Clientebogota, BigInteger> {

}
