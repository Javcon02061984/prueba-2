package mintic.LaGenerica.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Document
@Data
public class Usuario{
	
	@Id
	private Long cedula_usuario;
	private String nombre_usuario;
	private String sede_usuario;
	private boolean estado_usuario;
	
}