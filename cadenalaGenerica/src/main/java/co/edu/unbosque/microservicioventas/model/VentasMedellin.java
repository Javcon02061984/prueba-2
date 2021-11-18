package co.edu.unbosque.microservicioventas.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "db_ventas_medellin")
public class VentasMedellin {
	@Id
	private Integer codigoVenta;
	private BigInteger cedulaCliente;

	// array de detalle de la venta
	private BigInteger codigoProducto;
	private double cantidadProducto;
	private double valorProducto;
	private double IvaProducto;
	private double valorTotal;
	// fin detalle venta
	private double valorVenta;
	private double ivaVenta;
	private double totalVenta;
}
