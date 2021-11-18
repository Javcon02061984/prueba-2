package co.edu.unbosque.microservicioproveedores.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_proveedores")
public class Proveedor {
	@Id
	private BigInteger nit_proveedor;
	private String nombre_proveedor;
	private String email_proveedor;
	private String telefono_proveedor;
}
