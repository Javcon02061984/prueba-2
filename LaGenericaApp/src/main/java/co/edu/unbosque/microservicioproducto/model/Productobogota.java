package co.edu.unbosque.microservicioproducto.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Document(collection = "db_productos")
public class Productobogota {
	
	@Id
	private BigInteger codigo_producto;
	private String nombre_producto;
	private BigInteger nit_proveedor;
	private double precio_compra;
	private double iva_compra;
	private double precio_venta;

}
