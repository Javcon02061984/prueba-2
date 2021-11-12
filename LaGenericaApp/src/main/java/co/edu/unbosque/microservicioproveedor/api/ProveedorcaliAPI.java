package co.edu.unbosque.microservicioproveedor.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.microservicioproveedor.dao.ProveedorcaliDAO;
import co.edu.unbosque.microservicioproveedor.model.Proveedorcali;

import java.math.BigInteger;
import java.util.List;

public class ProveedorcaliAPI {

	@RestController // esta es una clase REST
	@RequestMapping("db_proveedores")
	public class ProveedoresAPI {
		@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
		private ProveedorcaliDAO proveedorcaliDAO;

		@PostMapping("/guardar")
		public void guardar(@RequestBody Proveedorcali proveedorcali) {
			proveedorcaliDAO.save(proveedorcali);
		}
		// Request convierte en un objeto Java

		@GetMapping("/listar")
		public List<Proveedorcali> listar() {
			return proveedorcaliDAO.findAll();
		}
		
		@DeleteMapping("/eliminar/{nit_proveedor}")
		public void eliminar(@PathVariable("nit_proveedor") BigInteger nit_proveedor) {
			proveedorcaliDAO.deleteById(nit_proveedor);
		}

		@PutMapping("/actualizar")
		public void actualizar(@RequestBody Proveedorcali proveedorcali) {
			proveedorcaliDAO.save(proveedorcali);
		}
		
		@GetMapping("/buscarProveedor")
		public String main(String args[]) {
		String proveedorcali = toString();
	    	return proveedorcali;
		}
	  
		/**@Override
		public String toString() {
	    return "Proveedor" + "proveedorcali" + ".";
	  } **/

	}
}