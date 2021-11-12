package co.edu.unbosque.microserviciosusuario.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciosusuario.modelo.Usuario;

public interface UsuarioDAO extends MongoRepository<Usuario, BigInteger> {

}
