package co.edu.unbosque.microserviciosusuario.modelo;

import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Document(collection = "db_usuarios")
public class Usuario {

	private BigInteger cedula_usuario;
	private String nombre_usuario;
	private String sede_usuario;
	private String password_usuario;

}
