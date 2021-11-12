package co.edu.unbosque.microservicioproducto.dao;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microservicioproducto.model.Productocali;
import co.edu.unbosque.microservicioproducto.model.Productomedellin;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public interface ProductocaliDAO extends MongoRepository<Productocali, BigInteger> {

}
