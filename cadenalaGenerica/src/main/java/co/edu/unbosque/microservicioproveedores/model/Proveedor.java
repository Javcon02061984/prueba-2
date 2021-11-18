package co.edu.unbosque.microservicioproveedores.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_proveedores")
public class Proveedor {
	@Id
	private BigInteger nitProveedor;
	private String nombreProveedor;
	private String emailProveedor;
	private String telefonoProveedor;
}
