package co.edu.unbosque.microserviciousuarios.dao;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.microserviciousuarios.model.Usuario;

public interface UsuarioDAO extends MongoRepository<Usuario, BigInteger> {

}
