package co.edu.unbosque.microservicioventas.api;

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

import co.edu.unbosque.microservicioventas.dao.VentasMedellinDAO;
import co.edu.unbosque.microservicioventas.model.VentasMedellin;

@RestController // esta es una clase REST
@RequestMapping("ventas_medellin")
public class VentasMedellinAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private VentasMedellinDAO ventasMedellinDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody VentasMedellin ventasMedellin) {
		ventasMedellinDAO.save(ventasMedellin);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<VentasMedellin> listar() {
		return ventasMedellinDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		ventasMedellinDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody VentasMedellin ventasMedellin) {
		ventasMedellinDAO.save(ventasMedellin);
	}

	@GetMapping("/buscar/{Id}")
	public VentasMedellin findById(@PathVariable BigInteger Id) {
		return ventasMedellinDAO.findById(Id).get();
	}

}
