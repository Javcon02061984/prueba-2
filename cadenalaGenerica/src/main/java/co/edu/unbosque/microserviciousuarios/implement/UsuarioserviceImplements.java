package co.edu.unbosque.microserviciousuarios.implement;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.edu.unbosque.microservicio.commons.GenericServiceImplement;
import co.edu.unbosque.microserviciousuarios.api.UsuarioAPI;
import co.edu.unbosque.microserviciousuarios.dao.UsuarioDAO;
import co.edu.unbosque.microserviciousuarios.model.Usuario;


@Service
public class UsuarioserviceImplements extends GenericServiceImplement<Usuario, BigInteger> implements UsuarioAPI{
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public CrudRepository<Usuario, BigInteger> getDao() {
		return usuarioDAO;
	}
	
}
