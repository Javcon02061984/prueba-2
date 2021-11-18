package co.edu.unbosque.microservicioproductos.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_productos_bogota")
public class ProductoBogota {
	@Id
	private BigInteger codigoProducto;
	private String nombreProducto;
	private BigInteger nitProveedor;
	private double precioCompra;
	private double ivaCompra;
	private double precioVenta;
}
