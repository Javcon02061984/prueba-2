package co.edu.unbosque.microservicioclientes.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioclientes.model.ClienteBogota;

public interface ClienteBogotaDAO extends MongoRepository<ClienteBogota, BigInteger> {

}
