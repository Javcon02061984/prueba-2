package co.edu.unbosque.microserviciocliente.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciocliente.model.Clientemedellin;
import co.edu.unbosque.microserviciosusuario.model.Usuariobogota;

public interface ClientemedellinDAO extends MongoRepository<Clientemedellin, BigInteger> {

}
