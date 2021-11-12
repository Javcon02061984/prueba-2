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

import co.edu.unbosque.microservicioproducto.dao.ProductobogotaDAO;
import co.edu.unbosque.microservicioproducto.model.Productobogota;


public class ProductobogotaAPI {
	@RestController // esta es una clase REST
	@RequestMapping("db_productos")
	public class ProductosAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ProductobogotaDAO productobogotaDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Productobogota productobogota) {
			productobogotaDAO.save(productobogota);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Productobogota> listar() {
			return productobogotaDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{codigo_producto}")
		public void eliminar(@PathVariable("codigo_producto") BigInteger codigo_producto) {
			productobogotaDAO.deleteById(codigo_producto);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Productobogota productobogota) {
			productobogotaDAO.save(productobogota);
		}
		
		@GetMapping("/buscarProducto")
		public String main(String args[]) {
		String productobogota = toString();
	    	return productobogota;
		}
	  
		/**@Override
		public String toString() {
	    return "Producto" + "productobogota" + ".";
	  } **/
	}
}
