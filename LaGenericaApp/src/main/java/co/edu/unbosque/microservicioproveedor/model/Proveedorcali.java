package co.edu.unbosque.microservicioproveedor.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Document(collection = "db_proveedores")
public class Proveedorcali {
	
	@Id
	private BigInteger nit_proveedor;
	private String nombre_Proveedor;
	private String email_proveedor;
	private String telefono_proveedor;


}
