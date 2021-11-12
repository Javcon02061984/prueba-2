package co.edu.unbosque.microservicioproducto.api;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.microservicioproducto.dao.ProductomedellinDAO;
import co.edu.unbosque.microservicioproducto.model.Productomedellin;


public class ProductomedellinAPI {
	
	@RestController // esta es una clase REST
	@RequestMapping("db_productos")
	public class ProductosAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ProductomedellinDAO productomedellinDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Productomedellin productomedellin) {
			productomedellinDAO.save(productomedellin);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Productomedellin> listar() {
			return productomedellinDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_usuario}")
		public void eliminar(@PathVariable("codigo_producto") BigInteger codigo_producto) {
			productomedellinDAO.deleteById(codigo_producto);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Productomedellin productomedellin) {
			productomedellinDAO.save(productomedellin);
		}
		
		@GetMapping("/buscarProducto")
		public String main(String args[]) {
		String productomedellin = toString();
	    	return productomedellin;
		}
	  
		/**@Override
		public String toString() {
	    return "Producto" + "productomedellin" + ".";
	  } **/
	}
}
