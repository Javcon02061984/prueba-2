package co.edu.unbosque.microserviciosusuario.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciosusuario.model.Usuariomedellin;

public interface UsuariomedellinDAO extends MongoRepository<Usuariomedellin, BigInteger> {

}