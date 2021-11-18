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

import co.edu.unbosque.microservicioventas.dao.VentasCaliDAO;
import co.edu.unbosque.microservicioventas.model.VentasCali;

@RestController // esta es una clase REST
@RequestMapping("ventas_cali")
public class VentasCaliAPI {
	@Autowired // inyecta la dependencia de todos los métodos del JPA para clienteDAO
	private VentasCaliDAO ventasCaliDAO;

	@PostMapping("/guardar")
	public void guardar(@RequestBody VentasCali ventasCali) {
		ventasCaliDAO.save(ventasCali);
	}

	// Request convierte en un objeto Java
	@GetMapping("/listar")
	public List<VentasCali> listar() {
		return ventasCaliDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		ventasCaliDAO.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void actualizar(@RequestBody VentasCali ventasCali) {
		ventasCaliDAO.save(ventasCali);
	}

	@GetMapping("/buscar/{Id}")
	public VentasCali findById(@PathVariable BigInteger Id) {
		return ventasCaliDAO.findById(Id).get();
	}

}
