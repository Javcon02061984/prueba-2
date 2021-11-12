package co.edu.unbosque.microservicioproducto.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import co.edu.unbosque.microservicioproducto.dao.ProductocaliDAO;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@Document(collection = "db_productos")
public class Productocali {

	@Id
	private BigInteger cedula_cliente;
	private String direccion_cliente;
	private String email_cliente;
	private String nombre_cliente;
	private String telefono_cliente;
}
