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

import co.edu.unbosque.microservicioproducto.dao.ProductocaliDAO;
import co.edu.unbosque.microservicioproducto.model.Productocali;



public class ProductocaliAPI {
	@RestController // esta es una clase REST
	@RequestMapping("db_productos")
	public class ProductosAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ProductocaliDAO productocaliDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Productocali productocali) {
			productocaliDAO.save(productocali);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Productocali> listar() {
			return productocaliDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{cedula_usuario}")
		public void eliminar(@PathVariable("codigo_producto") BigInteger codigo_producto) {
			productocaliDAO.deleteById(codigo_producto);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Productocali productocali) {
			productocaliDAO.save(productocali);
		}
		
		@GetMapping("/buscarProducto")
		public String main(String args[]) {
		String productocali = toString();
	    	return productocali;
		}
	  
		/**@Override
		public String toString() {
	    return "Producto" + "productocali" + ".";
	  } **/
	}
}
