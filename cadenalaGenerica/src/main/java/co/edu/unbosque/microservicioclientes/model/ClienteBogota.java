package co.edu.unbosque.microservicioclientes.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_clientes_bogota")
public class ClienteBogota {
	@Id
	private BigInteger cedulaCliente;
	private String nombreCliente;
	private String direccionCliente;
	private String telefonoCliente;
	private String emailCliente;	
}
