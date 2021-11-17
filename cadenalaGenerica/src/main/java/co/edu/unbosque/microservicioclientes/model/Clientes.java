package co.edu.unbosque.microservicioclientes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_clientes")
public class Clientes {
	@Id
	private Integer cedula_cliente;
	private String nombre_cliente;
	private String direccion_cliente;
	private String telefono_cliente;
	private String email_cliente;	
}
