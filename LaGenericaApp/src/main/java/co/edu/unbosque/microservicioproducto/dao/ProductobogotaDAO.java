package co.edu.unbosque.microservicioproducto.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproducto.model.Productobogota;

public interface ProductobogotaDAO extends MongoRepository<Productobogota, BigInteger> {

}
