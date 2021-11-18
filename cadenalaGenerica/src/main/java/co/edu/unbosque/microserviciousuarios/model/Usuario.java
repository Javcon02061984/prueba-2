package co.edu.unbosque.microserviciousuarios.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_usuarios")
public class Usuario {
	@Id
	private BigInteger cedula_usuario;
	private String nombre_usuario;
	private String sede_usuario;
	private String password_usuario;
}
